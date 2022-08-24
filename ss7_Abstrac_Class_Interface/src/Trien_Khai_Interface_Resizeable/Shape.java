package Trien_Khai_Interface_Resizeable;

import Trien_Khai_Interface_Colorable.Colorable;

public abstract class Shape implements Resizeable, Colorable {
    private String color = "red";
    private boolean filler = true;

    public Shape() {

    }
    public Shape(String color , boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "A shape with color of" + getColor() + "" + (isFiller() ? "filler" : "not filler");
    }
    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }
}
