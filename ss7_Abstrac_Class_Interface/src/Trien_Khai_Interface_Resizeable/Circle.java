package Trien_Khai_Interface_Resizeable;

public class Circle extends Shape {
    private double radius = 10;

    public Circle() {

    }
    public Circle(double radius, String color, boolean filler) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius *= (percent / 100);
    }

    @Override
    public void HowToColor() {
        System.out.println("No color");
    }
}
