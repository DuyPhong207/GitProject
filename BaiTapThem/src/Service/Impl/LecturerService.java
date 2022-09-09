package Service.Impl;

import Model.Lecturer;
import Repository.ILecturerRepository;
import Repository.Impl.LecturerRepository;
import Service.ILecturerService;

import java.util.Scanner;

public class LecturerService implements ILecturerService {

    private ILecturerRepository ILecturerRepository = new LecturerRepository();
    private Scanner sc = new Scanner(System.in);
    @Override
    public Lecturer getInfo() {
        System.out.println("Enter id: \n");
        int code = sc.nextInt();
        System.out.println("Enter name: \n");
        String name = sc.nextLine();
        System.out.println("Enter date of birth: \n");
        String dateOfBirth = sc.nextLine();
        System.out.println("Enter gender: \n");
        String gender = sc.nextLine();
        System.out.println("Enter level: \n");
        String level = sc.nextLine();
        Lecturer lecturer = new Lecturer(code, name, dateOfBirth,gender,level);
        return lecturer;
    }

    @Override
    public void addLecturer() {
        Lecturer lecturer = this.getInfo();
        ILecturerRepository.addLecturer(lecturer);
    }

    @Override
    public void showList() {
        for (Lecturer lecturer : ILecturerRepository.getAll()) {
            System.out.println(lecturer.toString());
        }
    }

    @Override
    public void removeLecturer() {
        System.out.println("Nhập mã giảng viên cần xóa :\n");
        int code = Integer.parseInt(sc.nextLine());
        Lecturer lecturer = new Lecturer(code);
        ILecturerRepository.removeLecturer(lecturer);
    }
}
