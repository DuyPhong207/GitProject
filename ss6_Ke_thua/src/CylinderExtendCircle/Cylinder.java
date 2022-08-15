package CylinderExtendCircle;

public class Cylinder extends Circle{
    private double height;
    public Cylinder (double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getTotalArea() {
        return getArea() * height;
    }
    public String toString() {
        super.toString();
        return getTotalArea() + "";
    }
}
