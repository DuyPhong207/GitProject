package KiemTraChuoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: \n");
        String string = sc.nextLine();
        String[] array = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String str : array) {
            stack.push(str);
        }
        for (String str : array) {
            queue.add(str);
        }
        String stackString = "";
        while (!stack.isEmpty()) {
            stackString = stackString + stack.pop();
        }
        String queueString = "";
        while (!queue.isEmpty()) {
            queueString = queueString + queue.poll();
        }
        if (stackString.equals(queueString)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
