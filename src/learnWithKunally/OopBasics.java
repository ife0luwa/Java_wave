package learnWithKunally;


public class OopBasics {
    public static void main(String[] args) {

        //create an object of class Student
        Student best = new Student(40, "lucius lyon", 96);

        //create another object of class Student
        Student world = new Student(best);

        Student random = new Student();


        System.out.println(best.id);
        System.out.println(best.name);
        System.out.println(best.score);
        System.out.println();
        System.out.println(random.id);
        System.out.println(random.name);


    }
}


//create a class
class Student {
    int id;
    String name;
    float score;

    // Note: "this" keyword refers to the object it is embedded
    //create an ordinary(predefined) object constructor
        //Student () {
        //this.id = 20;
        //this.name = "ifeoluwa clement";
        //this.score = 95;
    //}

    // create an object constructor that takes in arguments
    Student (int idNo, String fullName, float marks) {
        this.id = idNo;
        this.name = fullName;
        this.score = marks;
    }

    //create an object constructor that takes value from another object
    Student (Student other) {
        this.id = other.id;
        this.name = other.name;
        this.score = other.score;
    }

    //calling a constructor from another constructor
    Student () {
        this (13, "default boy", 90);
    }

    // add functions to the class
    void greetings () {
        System.out.println("the name is " + name);
    }

    void changeName (String newName) {
        this.name = newName;
    }
}
