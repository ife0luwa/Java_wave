package Polymorphism;

import java.util.Scanner;

class Car {
    //create fields/variables
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;
    private int seats;
    private String musicPlayer;

    //create a constructor
    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
        this.seats = 4;
        this.musicPlayer = "bluetooth stereo";
    }

    //create methods startEngine, accelerate, brake
     public String startEngine () {
         return "Engine started:Welcome to " + this.name;
     }

     public String accelerate () {
        return "speed increasing";
     }

     public String brake () {
         return "<<<< speed decreasing";
     }

    // create getters
    public String getName() {
        return this.name;
    }

    public int getCylinder() {
        return cylinder;
    }
}

class Challenger_SRT extends Car {
    public Challenger_SRT() {
        super("Challenger_SRT", 7);
    }

    // override methods
    @Override
    public String startEngine() {
        return "ignition on >>> 6.2L V8 Hellcat 6MT <<< starting your challenger SRT";
        //DODGE Challenger SRT 6.2L V8 Hellcat 6MT (707 HP)
    }

    @Override
    public String accelerate() {
        return "speed >>> (707 HP) >>> increasing ";
    }
}

class Durango extends Car {
    public Durango() {
        super("Durango", 4);
    }

    //override methods
    @Override
    public String startEngine() {
        return "ignition on >>> 3.5L V6 8AT  <<< starting your challenger SRT";
        //DODGE Durango 3.5L V6 8AT (293 HP) Single exhaust
    }

    @Override
    public String accelerate() {
        return "speed >>> (293 HP) >>> increasing ";
    }
}

class Ram extends Car {
    public Ram() {
        super("Ram", 5);
    }

    //override method - no startEngine method
    @Override
    public String accelerate() {
        return "speed >>> (310 HP) >>> increasing ";
    }
}





public class Polymorphism_challenge {
    public static void main(String[] args) {
  // you are having trouble selecting for each day 1 car to drive
  // out of the 3  models of dodge cars in your garage
  // let me help you out
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of days between 5 and 10: " );
        int days = input.nextInt();
        for (int i = 1; i <= days; i++) {
            Car myCars = randomCar();
            System.out.println("Day" + i + ": " + myCars.getName() + "\n"
            + myCars.startEngine() + "\n" + myCars.accelerate() + "\n" );
        }

    }


    //create a method to pick cars randomly from my garage
    public static Car randomCar () {
        int randomNumber = (int) (Math.random() * 3) + 1;
        //System.out.println("car number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Challenger_SRT();
            case 2:
                return new Durango();
            case 3:
                return new Ram();
            default:
                return null;
        }



    }
}
