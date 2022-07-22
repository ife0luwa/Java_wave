package Lambda_Expressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new Thread(() ->{
//            System.out.println("Printing from the Runnable");
//            System.out.println("Printing a line");
//            System.out.println("Printing another line");
//        }).start();

        MusicAlbum mil = new MusicAlbum("Made in Lagos", 2020);
        MusicAlbum tat = new MusicAlbum("Twice as Tall", 2020);
        MusicAlbum agt = new MusicAlbum("A Good Time", 2019);
        MusicAlbum ag = new MusicAlbum("African Giant", 2018);

        List<MusicAlbum> musicAlbums = new ArrayList<>();
        musicAlbums.add(mil);
        musicAlbums.add(tat);
        musicAlbums.add(agt);
        musicAlbums.add(ag);

            /** normal method without lambda */
        musicAlbums.sort(new Comparator<MusicAlbum>() {
            @Override
            public int compare(MusicAlbum album1, MusicAlbum album2) {
                return album1.getName().compareToIgnoreCase(album2.getName());
            }
        });

            /** Lambda method */
        musicAlbums.sort((MusicAlbum album1, MusicAlbum album2) ->
                        album1.getName().compareToIgnoreCase(album2.getName()));

            for(MusicAlbum album : musicAlbums) {
                System.out.println(album.getName());
            }

            /** Normal method without Lambda */
        String combinedString = addString(new CapsJoin() {
            @Override
            public String capsAndJoin(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }},
                musicAlbums.get(0).getName(), musicAlbums.get(1).getName() );

        System.out.println(combinedString);
        System.out.println();


            /** Lambda method */
        CapsJoin cj = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();
        String combinedStrings = addString(cj, musicAlbums.get(0).getName(), musicAlbums.get(1).getName());
        System.out.println(combinedStrings);


    AnotherClass anotherClass = new AnotherClass();
    String s = anotherClass.doSomeStrings();
    System.out.println(s);

    }

        /** create a static method */
    public static String addString (CapsJoin cj, String s1, String s2) {
        return cj.capsAndJoin(s1, s2);
    }




}

class MusicAlbum {
    private String name;
    private int year;

    public MusicAlbum(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

interface CapsJoin {
    public String capsAndJoin(String s1, String s2);
}

class AnotherClass {
    public String doSomeStrings () {
       int i = 0;
        //i++;
        CapsJoin caps = (s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            System.out.println("The i in the lambda expression is " + i);
            return s1.toUpperCase() + s2.toUpperCase();
        };
        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return Main.addString(caps, "String1", "String2");
    }
}
