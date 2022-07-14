package Composition;

public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(40, 20, 30);
        Case theCase = new Case("220B", "Alien ware", "480", dimensions);

        // create an instance of the Resolution class in myMonitor since we don't need the variable
        //for anything else besides inserting into myMonitor
        Monitor myMonitor = new Monitor("27inch Beast", "hp", 27, new Resolution(2540, 1440));
        Motherboard myMotherboard = new Motherboard("BJ-200", "dell", 8, 12, "v2.44");

        Computer myComputer = new Computer(theCase,myMonitor,myMotherboard);
        myComputer.powerUp();


    }
}
