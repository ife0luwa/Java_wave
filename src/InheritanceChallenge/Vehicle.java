package InheritanceChallenge;

public class Vehicle {
    private int sterring;
    private int tires;
    private int seats;
    private int fuelTank;

//create  constructors


    public Vehicle() {
        this(1, 1, 1, 1);
    }

    public Vehicle(int sterring, int tires, int seats, int fuelTank) {
        this.sterring = sterring;
        this.tires = tires;
        this.seats = seats;
        this.fuelTank = fuelTank;
    }

//create methods
    public void changeGears () {
        System.out.println("vehicle changing gears");
    }

    public void move (String speed) {
        System.out.println("moving at speed " + speed);
    }
}
