package Inheritance_oop;

public class Dog extends Animal {
    // create fields for dog
    private int dogEyes;
    private int dogLegs;
    private int dogTail;
    private int dogTeeth;
    private String dogCoat;

    // create a constructor for Dog subclass from animal superclass
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.dogEyes = eyes;
        this.dogLegs = legs;
        this.dogTail = tail;
        this.dogTeeth = teeth;
        this.dogCoat = coat;
    }

    // create methods
    private void chew () {
        System.out.println("Dog.chew() called");
    }

    // create an override method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); //"super" from the super class Animal
    }
    //create further methods
    public void walk () {
        System.out.println("Dog.walk() called");
        super.move("5mps");
    }

    public void run () {
        System.out.println("Dog.run() called");
        move("10mps");
        /*
note: Compare to the walk() method above.
when the keyword "super" is absent when calling a method (e.g move() in this case),
java checks if there's a move() method in this class before checking the super class
        */
    }

    // let's override the move method from the Animal super class
    @Override
    public void move(String speed) {
        System.out.println("Dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(String speed) {
        System.out.println("Dog.moveLegs() is called");
    }
}
