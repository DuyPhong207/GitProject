package Repository;

import Model.Lecturer;
import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class LecturerRepositoryImpl implements LecturerRepository {
    private ArrayList<Lecturer> lecturerList;
    Scanner sc = new Scanner(System.in);

    @Override
    public void addNewLecturer() {
        System.out.println("Enter id: ");
        int newId = sc.nextInt();
        System.out.println("Enter name: ");
        String newName = sc.nextLine();
        System.out.println("Enter gender: ");
        String newGender = sc.nextLine();
        System.out.println("Enter day of birth: ");
        String newDob = sc.nextLine();
        System.out.println("Enter level: ");
        String newLevel = sc.nextLine();
        Lecturer newLecturer = new Lecturer(newId, newName, newGender, newDob, newLevel);
        lecturerList.add(newLecturer);
    }

    @Override
    public void removeLecturer(int index) {

    }

    @Override
    public void showListLecturer() {
        for (Lecturer lecturer : lecturerList) {
            System.out.println(lecturer.toString() + "\n");
        }
    }
}
