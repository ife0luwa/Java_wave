package com.learningwithBuchalka;

public class Cars {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //create funcs (methods) inside our class
    public void setModel (String make) {
        String validModel = make.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = make;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel () {
        return this.model;
    }
}
