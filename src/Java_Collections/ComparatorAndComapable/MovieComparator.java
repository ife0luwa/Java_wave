package Java_Collections.ComparatorAndComapable;

//A Java program to demonstrate Comparator interface
import java.util.*;

// A class 'Movie' that implements Comparable
class MovieComparator implements Comparable<Films>
{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Films m)
    {
        return this.year - m.getYear();
    }

    // Constructor
    public MovieComparator(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear()	 { return year; }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<Films>
{
    public int compare(Films m1, Films m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<Films>
{
    public int compare(Films m1, Films m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}

// Driver class
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Films> list = new ArrayList<Films>();
        list.add(new Films("Force Awakens", 8.3, 2015));
        list.add(new Films("Star Wars", 8.7, 1977));
        list.add(new Films("Empire Strikes Back", 8.8, 1980));
        list.add(new Films("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of ratingCompare
        //				 (2) Call Collections.sort
        //				 (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Films films : list)
            System.out.println(films.getRating() + " " +
                    films.getName() + " " +
                    films.getYear());


        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Films films : list)
            System.out.println(films.getName() + " " +
                    films.getRating() + " " +
                    films.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Films films : list)
            System.out.println(films.getYear() + " " +
                    films.getRating() + " " +
                    films.getName()+" ");
    }
}

