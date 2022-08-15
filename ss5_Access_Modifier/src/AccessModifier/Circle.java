package AccessModifier;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public double pi = 3.1412;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * pi;
    }
}
