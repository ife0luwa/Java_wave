package InheritanceChallenge;

public class Car extends Vehicle {
    public Car() {
        this(1,4,4,1,4, "boot");
    }

    public Car(int sterring, int tires, int seats, int fuelTank, int seatBelt, String trunk) {
        super(sterring, tires, seats, fuelTank);
        this.seatBelt = seatBelt;
        this.trunk = trunk;
    }

    private int seatBelt;
    private String trunk;

    //create method

    @Override
    public void move(String speed) {
        System.out.println("car driving at speed " + speed);
    }
}

//create a subclass of cars
 class Ferrari extends Car {
    //create constructors

    public Ferrari() {
        this(1,4,2,1,2,"boot", "dropTop", 1);
    }

    public Ferrari(int sterring, int tires, int seats, int fuelTank, int seatBelt, String trunk, String roof, int passengers) {
        super(sterring, tires, seats, fuelTank, seatBelt, trunk);
        this.roof = roof;
        this.passengers = passengers;
    }

    private String roof;
    private int passengers;
}
