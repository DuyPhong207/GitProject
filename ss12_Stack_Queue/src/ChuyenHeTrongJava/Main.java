package ChuyenHeTrongJava;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int temp = number % 2;
            stack.push(temp);
            number /= 2;
        }
        final int SIZE= stack.size();
        for(int i=0; i<SIZE;i++){
            System.out.print(stack.pop()+" ");
        }
    }
}
