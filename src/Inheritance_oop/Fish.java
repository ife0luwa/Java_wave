package Inheritance_oop;

public class Fish extends Animal {
//create fields
    private int gills;
    private int eyes;
    private int fins;

//create a constructor
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

// create methods
    private void rest () {

    }
    private void moveMuscles () {

    }
    private void moveBackFin () {

    }
    private void swim (String speed) {
        moveMuscles();
        moveBackFin();
        super.move("5pms");

    }
}
