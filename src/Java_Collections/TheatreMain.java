package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreMain {
    public static void main(String[] args) {
        Theatre springBowl = new Theatre("Spring Bowl", 8, 12);

        if(springBowl.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        if(springBowl.reserveSeat("D12")) {
            System.out.println("Please pay for " + "D12");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reversedSeats = new ArrayList<>(springBowl.getSeats());
        Collections.reverse(reversedSeats);
        printList(reversedSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(springBowl.getSeats());
        priceSeats.add(springBowl.new Seat("A00", 13.00));
        priceSeats.add(springBowl.new Seat("B00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);  //sorting by the comparator
        printList(priceSeats);





        }




        public static void printList (List<Theatre.Seat> list) {
            for(Theatre.Seat eachSeat : list) {
                System.out.print(" " + eachSeat.getSeatNumber() + " $" + eachSeat.getPrice() + ",");
            }
            System.out.println();
            System.out.println("===========================================================");
        }


}
