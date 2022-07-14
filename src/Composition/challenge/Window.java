package Composition.challenge;

public class Window {
    private int burglary;
    private boolean curtains;
    private Measurement facet;

    public Window(int burglary, boolean curtains, Measurement facet) {
        this.burglary = burglary;
        this.curtains = curtains;
        this.facet = facet;
    }

    public void removeCurtains () {
        System.out.println("Curtains removed");
    }
}
