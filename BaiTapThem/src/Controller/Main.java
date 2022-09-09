package Controller;

import Service.ILecturerService;
import Service.IStudentService;
import Service.Impl.LecturerService;
import Service.Impl.StudentService;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static LecturerController lecturerController = new LecturerController();
    private static StudentController studentController = new StudentController();
    private static Scanner sc = new Scanner(System.in);
    private static int choice;
    public static void main(String[] args) {
        while (true) {
            System.out.println("" +
                    "---- MANAGER MENU ----\n"+
                    "1. Student Manager\n"+
                    "2. Lecturer manager\n"+
                    "3. Thoát chương trình");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentController.showStudentMenu();
                    break;
                case 2:
                    lecturerController.showLecturerMenu();
            }

        }
    }
}
