package Controller;

import Model.Student;
import Service.LecturerService;
import Service.LecturerServiceImpl;
import Service.StudentService;
import Service.StudentServiceImpl;

import java.util.Scanner;

public class Main {
    private static StudentService studentService = new StudentServiceImpl();
    private static LecturerService lecturerService = new LecturerServiceImpl();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN \n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát");
            System.out.println("Choọn chức năng: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1. Giảng viên.\n" +
                            "2. Sinh viên.");
                    choose = sc.nextInt();
                    if (choose == 1) {
                        lecturerService.addNewLecturer();
                    } else if (choose == 2) {
                        studentService.addStudent();
                    } else {
                        System.out.println("vui lòng bắt đầu lại và nhập đúng thao tác.");
                    }
                case 2:
                    System.out.println("1. Giảng viên.\n" +
                            "2. Sinh viên.");
                    choose = sc.nextInt();
                    if (choose == 1) {
                        System.out.println("Nhập id giảng viên: ");
                    } else if (choose == 2) {
                        studentService.addStudent();
                    } else {
                        System.out.println("vui lòng bắt đầu lại và nhập đúng thao tác.");
                    }
                case 3:
                    System.out.println("1. Giảng viên.\n" +
                            "2. Sinh viên.");
                    choose = sc.nextInt();
                    if (choose == 1) {
                        lecturerService.showListLecturer();
                    } else if (choose == 2) {
                        studentService.showListStudent();
                    } else {
                        System.out.println("vui lòng bắt đầu lại và nhập đúng thao tác.");
                    }
            }

        } while (choose != 4);
    }
}

