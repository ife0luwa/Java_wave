package Java_Collections.LinkedList;

import Java_Thread_and_Concurrency.Countdown.CountdownColor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {
    public static void main(String[] args) {

        /* Creating a LinkedList of Character type */
        LinkedList<String> artists = new LinkedList<>();

        /* Inserting some Character values to our LinkedList */
//        artists.add("omah lay");
//        artists.add("doja cat");
//        artists.add("ed sheeran");
//        artists.add("rema");
//        artists.add("damian marley");

        addToDic(artists, "omah lay");
        addToDic(artists, "doja cat");

        /**
         * Note: CountdownColor object in the print statements is just
         * for aesthetic. Adding color to the console print
         */

        /* for loop */
        for(int i = 0; i < artists.size(); i ++) {
            System.out.println(CountdownColor.ANSI_BLUE + artists.get(i));
        }


        /* using a while loop */
        int i = 0;
        while(i < artists.size()) {
            System.out.print(CountdownColor.ANSI_CYAN + artists.get(i) + ", ");
            i++;
        }

        System.out.println();

        /* using an iterator */
        Iterator artistPick = artists.iterator();
        while(artistPick.hasNext()) {
            System.out.println(CountdownColor.ANSI_PURPLE + artistPick.next());
        }


    }

    static void addToDic (LinkedList<String> artistDic, String artist) {
        ListIterator<String> dicCrawl = artistDic.listIterator();
        while(dicCrawl.hasNext()) {
        int comparator = dicCrawl.next().compareToIgnoreCase(artist);
            if(comparator < 0) {
                artistDic.add(artist);
            } else if(comparator > 0) {
                dicCrawl.previous();
                artistDic.add(artist);
            }
        }
            artistDic.add(artist);
    }
}
