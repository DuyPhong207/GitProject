package QuadraticEquationClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Có nghiệm kép = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Có 2 nghiệm phân biệt" + "\nX1 = " + quadraticEquation.getRoot1() + "\nX2 = " + quadraticEquation.getRoot2());
        }
    }
}
