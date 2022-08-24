package Trien_Khai_Interface_Resizeable;

import java.util.SplittableRandom;

public class Rectangle extends Shape{
    private double width = 10;
    private double height = 5;
    public Rectangle() {

    }
    public Rectangle(double width, double height, String color, boolean filler) {
        super(color,filler);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with width = "
                + getWidth()
                + " and height = "
                + getHeight()
                + ", which is a subclass of "
                + super.toString()
                + ", Area= " +
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.width *= (percent / 100);
        this.height *= (percent / 100);
    }

    @Override
    public void HowToColor() {
        System.out.println("Color one width and one height");
    }
}
