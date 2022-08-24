package Trien_Khai_Interface_Resizeable;

public class Square extends Shape {
    private double side = 10;
    public Square() {

    }
    public Square(double side, String color, boolean filler) {
        super(color, filler);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A rectangle with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area= " +
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 100);
    }

    @Override
    public void HowToColor() {
        System.out.println("Color all four sides");
    }
}
