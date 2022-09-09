package Service.Impl;

import Model.Student;
import Repository.IStudentRepository;
import Repository.Impl.StudentRepository;
import Service.IStudentService;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository IStudentRepository = new StudentRepository();
    private Scanner sc = new Scanner(System.in);
    @Override
    public Student getInfo() {
        System.out.println("Enter id: \n");
        int code = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: \n");
        String name = sc.nextLine();
        System.out.println("Enter date of birth: \n");
        String dateOfBirth = sc.nextLine();
        System.out.println("Enter gender: \n");
        String gender = sc.nextLine();
        System.out.println("Enter class: \n");
        String className = sc.nextLine();
        System.out.println("Enter score: \n");
        float score = Float.parseFloat(sc.nextLine());
        Student student = new Student(code, name, dateOfBirth, gender, className, score);
        return student;
    }

    @Override
    public void addStudent() {
        Student student = this.getInfo();
        IStudentRepository.addStudent(student);
    }

    @Override
    public void showList() {
        for (Student student : IStudentRepository.getAll()) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập mã của sinh viên cần xóa");
        int code = Integer.parseInt(sc.nextLine());
        Student student = new Student(code);
        IStudentRepository.removeStudent(student);
    }
}
