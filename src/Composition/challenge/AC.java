package Composition.challenge;

public class AC {
    private String model;
    private String capacity;

    public AC(String model, String capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public void controlAC (String remote) {
        System.out.println(remote + " remote is pressed!");
    }
}
