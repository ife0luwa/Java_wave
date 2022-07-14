package Java_Collections.ComparatorAndComapable;

// A Java program to demonstrate use of Comparable
import java.util.*;

// A class 'Movie' that implements Comparable
class Films implements Comparable<Films>
{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Films m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Films(String nm, double rt, int yr)
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

// Driver class
class main
{
    public static void main(String[] args)
    {
        ArrayList<Films> list = new ArrayList<Films>();
        list.add(new Films("Force Awakens", 8.3, 2015));
        list.add(new Films("Star Wars", 8.7, 1977));
        list.add(new Films("Empire Strikes Back", 8.8, 1980));
        list.add(new Films("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Films films : list)
        {
            System.out.println(films.getName() + " " +
                    films.getRating() + " " +
                    films.getYear());
        }
    }
}

