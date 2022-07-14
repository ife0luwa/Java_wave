package Composition.challenge;

public class Closet {
    private int waterCloset;
    private int mirror;
    private int toiletries;

    public Closet(int waterCloset, int mirror, int toiletries) {
        this.waterCloset = waterCloset;
        this.mirror = mirror;
        this.toiletries = toiletries;
    }

    public void flush () {
        System.out.println("water Closet is flushed");
    }

    public int getWaterCloset() {
        return waterCloset;
    }

    public int getMirror() {
        return mirror;
    }

    public int getToiletries() {
        return toiletries;
    }
}
