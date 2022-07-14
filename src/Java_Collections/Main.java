package Java_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


        LinkedList<String> likedSongs = new LinkedList<>();

        addAlphabetically(likedSongs,"BP/ No Judgement");
        addAlphabetically(likedSongs,"baby");
        addAlphabetically(likedSongs,"better with the Lights Off");
        addAlphabetically(likedSongs,"90210");
        addAlphabetically(likedSongs,"BP/ No Judgement");
        addAlphabetically(likedSongs,"Affairs of the heart");
        addAlphabetically(likedSongs,"Borrowed Love");


        printList(likedSongs);
        //                                    bp
        //                    better
        //                           borrowed
        //90210
        //               baby
        //       affairs

//        String a = "age";
//        String b = "ago";
//        System.out.println(b.compareTo(a));
//
//        //a=20 b=30
//        //a.compareTo(b) = -10
//        //b.compareTo(a) = 10



    }


    public static void printList (LinkedList<String> myList) {
        Iterator<String> i = myList.iterator();
        while(i.hasNext()) {
            System.out.println("Now playing " + i.next());
        }
        System.out.println("=============================");
    }


    private static void addAlphabetically (LinkedList<String> playlist, String newMusic) {
        ListIterator<String> lit = playlist.listIterator();
        //lit.add(newMusic);
        while (lit.hasNext()) {
          int firstOrSecond = lit.next().compareToIgnoreCase(newMusic);
          if (firstOrSecond > 0) {
              lit.previous();
              lit.add(newMusic);
              return;
          }
          if(firstOrSecond == 0) {
              return;
          }

        }
        lit.add(newMusic);
        //System.out.println("here");
        //return;
    }



}
