package Controller;

import Service.ILecturerService;
import Service.IStudentService;
import Service.Impl.LecturerService;
import Service.Impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    private int choice;
    public void showStudentMenu() {
        while (true) {
            System.out.println("" +
                    "---- STUDENT MENU ----\n" +
                    "1. Thêm mới học viên\n"+
                    "2. Xóa học viên\n"+
                    "3. Xem danh sách học viên\n"+
                    "4. Về menu chính");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.removeStudent();
                    break;
                case 3:
                    studentService.showList();
                    break;
                case 4:
                    return;
            }
        }
    }
}
