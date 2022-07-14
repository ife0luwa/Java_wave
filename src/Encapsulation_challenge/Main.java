package Encapsulation_challenge;

public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(75,false);
        System.out.println("Pages printed: " + myPrinter.print(10));
        System.out.println("Pages printed: " + myPrinter.print(27));
        System.out.println("Toner level: " + myPrinter.fillUp(10));
        System.out.println("Total pages printed: " + myPrinter.getPagesPrinted());
    }
}
