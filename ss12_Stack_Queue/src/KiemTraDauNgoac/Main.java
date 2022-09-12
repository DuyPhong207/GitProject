package KiemTraDauNgoac;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression: \n");
        String str = sc.nextLine();
        Stack leftBracket = new Stack();
        Stack rightBracket = new Stack();
        for (int i = 0;i < str.length();i++) {
            if (str.charAt(i) == '(') {
                leftBracket.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                rightBracket.push(str.charAt(i));
            }
        }
        if (leftBracket.size() == rightBracket.size()) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
