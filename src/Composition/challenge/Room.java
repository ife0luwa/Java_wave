package Composition.challenge;

public class Room {
    private AC myAC;
    private Closet myCloset;
    private Furniture myFurniture;
    private Window myWindow;

    public Room(AC myAC, Closet myCloset, Furniture myFurniture, Window myWindow) {
        this.myAC = myAC;
        this.myCloset = myCloset;
        this.myFurniture = myFurniture;
        this.myWindow = myWindow;
    }

    // add methods to access objects via getters
    public void reduceTemp (int temp) {
        getMyAC().controlAC("sharp");
        System.out.println("AC temp. is reduced to " + temp + " degree celsius");
    }

    public void openWindow () {
        getMyWindow().removeCurtains();
        System.out.println("Window is opened");
    }

    // add methods to hide objects (i.e. not using a getter)
    public void cleanCloset (String disinfectant) {
        System.out.println(disinfectant + " applied to WC.");
        System.out.println("Closet cleaned!");
    }


    //create getters
    public AC getMyAC() {
        return myAC;
    }

    public Window getMyWindow() {
        return myWindow;
    }
}
