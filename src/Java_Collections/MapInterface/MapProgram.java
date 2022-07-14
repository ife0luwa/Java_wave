package Java_Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> musicBook = new HashMap<>();

        /** to check if they hashmap already contains a key */
        if(musicBook.containsKey("Afro beats")) {
            System.out.println("Afro beats already added");
        } else{
            musicBook.put("Afro beats", "Burna boy, Wizkid, Tems, Davido, Black Koffee");
            System.out.println("Afro beats successfully added");
        }

        musicBook.put("Hip Hop", "Drake, Future, Doja cat, Megan the stallion, Lil baby");
        musicBook.put("Gospel", "Nathaniel Bassey, The Spirituals, Lecrae, Sunday Service Choir, Solomon Lange");

        /**
         * The hashmap.put() method returns null if we are adding a key for the first time
         * but returns the previous value if the key has already been added, while overwriting the previous value
         */
        System.out.println(musicBook.put("Rap", "Kendrick Lamar, Ladi Poe, J Cole, Kanye West, Jay Z"));
        System.out.println(musicBook.put("Rap", "Eminem, Joyner Lucas, MI, Nicki Minaj, Lil Wayne"));

        System.out.println("==========================================================================");

        System.out.println(musicBook.remove("Rap"));


//        System.out.println(musicBook.replace("Hip Hop", "Drake, Future, Doja cat, Megan the stallion, Lil baby",
//                "Chris Brown, Da Baby, Cardi B, Justin Bieber, Gunna"));;


        System.out.println(musicBook.replace("Hip Hop", "Chris Brown, Da Baby, Cardi B, Justin Bieber, Gunna"));

        for(String genre : musicBook.keySet()) { /** loop through the keys in a map with the keySet method */
            System.out.println(genre + ": " + musicBook.get(genre) );
        }







    }
}
