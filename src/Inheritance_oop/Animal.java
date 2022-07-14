package Inheritance_oop;

public class Animal {
    private String animalName;
    private int animalBrain;
    private int animalBody;
    private int animalSize;
    private int animalWeight;

    // create a constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.animalName = name;
        this.animalBrain = brain;
        this.animalBody = body;
        this.animalSize = size;
        this.animalWeight = weight;
    }

    // create methods
    public void eat () {
        System.out.println("animal.eat() called");
    }
    public void move (String speed) {
        System.out.println("Animal.move() called. Animal is moving at speed " + speed);
    }

    // create getters
    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalBrain() {
        return animalBrain;
    }

    public int getAnimalBody() {
        return animalBody;
    }

    public int getAnimalSize() {
        return animalSize;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }
}
