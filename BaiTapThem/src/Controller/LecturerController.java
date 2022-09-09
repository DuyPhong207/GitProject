package Controller;

import Service.Impl.StudentService;

import java.util.Scanner;

public class LecturerController {
    private Service.IStudentService lecturerService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    private int choice;

    public void showLecturerMenu() {
        while (true) {
            System.out.println("" +
                    "---- LECTURER MENU ----\n" +
                    "1. Thêm mới giảng viên\n" +
                    "2. Xóa giảng viên\n" +
                    "3. Xem danh sách giảng viên\n" +
                    "4. Về menu chính");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    lecturerService.addStudent();
                    break;
                case 2:
                    lecturerService.removeStudent();
                    break;
                case 3:
                    lecturerService.showList();
                    break;
                case 4:
                    return;
            }
        }
    }
}