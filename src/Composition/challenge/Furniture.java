package Composition.challenge;

public class Furniture {
    private int chairs;
    private int tables;
    private int wardrobe;
    private int bed;
    private Size frameSize;

    public Furniture(int chairs, int tables, int wardrobe, int bed, Size framesSize) {
        this.chairs = chairs;
        this.tables = tables;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.frameSize = framesSize;
    }

    public void openWardrobe () {
        System.out.println("Wardrobe is opened");
    }
}
