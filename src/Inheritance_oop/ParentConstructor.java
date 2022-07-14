package Inheritance_oop;

class ParentConstructor {
    private int x;
    private int y;

    public ParentConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class OverloadedConstructor extends ParentConstructor {
    private int width;
    private int height;

    // this constructor calling the 2nd constructor with the "this()" call
    public OverloadedConstructor (int x, int y) {
        this (x, y, 0, 0);
    }
    //2nd constructor calling the constructor of the parent class with the "super()" call
    public OverloadedConstructor(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }


}
