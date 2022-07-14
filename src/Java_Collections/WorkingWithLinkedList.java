package Java_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<String> vacationList = new LinkedList<>();
        addAlphabetically(vacationList,"bora bora");
        addAlphabetically(vacationList,"santorini");
        addAlphabetically(vacationList,"ibiza");
        addAlphabetically(vacationList,"mykonos");
        addAlphabetically(vacationList,"south african safari");
        addAlphabetically(vacationList,"maldives");

        printList(vacationList);
//        addAlphabetically(vacationList, "ibiza");




//        vacationList.add("bora bora");
//        vacationList.add("santorini");
//        vacationList.add("ibiza");
//        vacationList.add("mykonos");
//        vacationList.add("South african safari");
//        vacationList.add("maldives");
//
//        printList(vacationList);
//
//        vacationList.add(2, "Egypt");
//        printList(vacationList);
//
//        vacationList.remove(4);
//        printList(vacationList);
    }

    public static void printList (LinkedList<String> myList) {
        Iterator<String> i = myList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=============================");
    }


    private static boolean addAlphabetically (LinkedList<String> myList, String newCity) {
        ListIterator<String> myListIterator = myList.listIterator();
        while (myListIterator.hasNext()) {
            int compare = myListIterator.next().compareToIgnoreCase(newCity);
            if (compare == 0) {                                                             //if the city names are the same do not add
                System.out.println("City has already been added to vacation list");
                return false;
            }
            else if (compare > 0) {                                                         //means the 2nd value comes after the 1st value in a dic
                myListIterator.previous();
                myListIterator.add(newCity);
                return true;
            }
//            else if (compare < 0) {
//            }
        }
        myListIterator.add(newCity);
        return true;
    }

}
