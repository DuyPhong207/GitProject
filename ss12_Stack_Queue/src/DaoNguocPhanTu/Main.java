package DaoNguocPhanTu;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: \n");
        int amount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < amount; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng: \n");
            int number = Integer.parseInt(sc.nextLine());
            integerStack.push(number);
        }
        System.out.println("Mảng nhập vào :\n");
        for (int i = 0; i < integerStack.size(); i++) {
            System.out.print(integerStack.get(i) + ", ");
        }

        Stack<Integer> newStack = new Stack<>();
        for (int i = 0; i < integerStack.size();i++) {
            newStack.push(integerStack.get(i));
        }

        System.out.println("Mảng sau khi đảo ngược:\n");
        for (int i = 0; i < integerStack.size();i++) {
            System.out.print(newStack.pop() + ", ");
        }
    }
}
