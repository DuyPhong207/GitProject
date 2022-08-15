package AccessModifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter darius: ");
        double radius = sc.nextDouble();

        Circle newCircle = new Circle(radius);

        System.out.println("Area = " + newCircle.getArea());
    }
}
