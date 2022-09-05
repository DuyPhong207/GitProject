package Controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("----Menu----\n"
                    + "1. \n"
                    + "2. \n"
                    + "3. \n"
                    + "4. \n"
                    + "5. \n"
                    + "6. Exit");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    System.out.println("----Menu----\n"
                            + "1. \n"
                            + "2. \n"
                            + "3. Return main menu");
                    int select1 = Integer.parseInt(sc.nextLine());
            }
        } while (select != 6);
    }
}
