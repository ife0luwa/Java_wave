package Java_input_and_output.Writing_and_reading_files;

import java.io.*;
import java.util.*;

public class RealLocations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException { //try - resource method is an alternative to try-finally method
        try(FileWriter myFile = new FileWriter("myLocations.txt");
            FileWriter dirFile = new FileWriter("directions.txt")) {
            for(Location places : locations.values()) {
                myFile.write(places.getLocationID() + "," + places.getDescription() + "\n");
                for(String direction : places.getExits().keySet()) {
                    dirFile.write(places.getLocationID() + "," + direction + "," + places.getExits().get(direction) + "\n");
                }
            }
        }
// create the try - finally method

//        FileWriter myFile = null;
//        try {
//            FileWriter myFile = new FileWriter("myLocations.txt"); //name our output files
//            for(Location places : locations.values()) { //loop thu variable locations
//                myFile.write(places.getLocationID() + "," + places.getDescription() + "\n");
//            }
//        catch (IOException e) {
//            System.out.println("in the catch block");
//            System.out.println(e.toString());
//        } finally {
//            System.out.println("In the finally block");
//            try {
//                if(myFile != null) {
//                    System.out.println("Closing file now");
//                    myFile.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }



    static {
        try (Scanner input = new Scanner(new FileReader("locations_big.txt"))){
            input.useDelimiter(","); //where the scanner should pause (denoting where every piece of data is separated)
            while(input.hasNextLine()) {  //while there's still a line to read in the file
                int loc = input.nextInt();
                input.skip(input.delimiter());
                String description = input.nextLine();
                System.out.println("Imported loc: " + loc + "," + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



        //Now read the exits
        try (Scanner input = new Scanner(new BufferedReader(new FileReader("directions_big.txt")))) {
            input.useDelimiter(",");
            while (input.hasNextLine()) {
                //method 1
//                int loc = input.nextInt();
//                input.skip(input.delimiter());
//                String direction = input.next();
//                input.skip(input.delimiter());
//                String dest = input.nextLine();
//                int destination = Integer.parseInt(dest);

                //method 2
                String myData = input.nextLine(); //to read the entire line into a string
                String [] data = myData.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);
                System.out.println("Imported loc " + loc + ": " + direction + ": " + destination);
                Location myLocation = locations.get(loc);
                myLocation.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



//        Map<String, Integer> tempExit = new HashMap<String, Integer>();
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 2);
//        tempExit.put("E", 3);
//        tempExit.put("S", 4);
//        tempExit.put("N", 5);
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 5);
//        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 1);
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 1);
//        tempExit.put("W", 2);
//        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("S", 1);
//        tempExit.put("W", 2);
//        locations.put(5, new Location(5, "You are in the forest",tempExit));

    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
