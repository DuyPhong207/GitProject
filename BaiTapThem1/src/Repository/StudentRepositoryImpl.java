package Repository;

import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepositoryImpl implements StudentRepository {
    private ArrayList<Student> studentList;
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        System.out.println("Enter id: \n");
        int newId = sc.nextInt();
        System.out.println("Enter name: \n");
        String newName = sc.nextLine();
        System.out.println("Enter gender: \n");
        String newGender = sc.nextLine();
        System.out.println("Enter day of birth: \n");
        String newDob = sc.nextLine();
        System.out.println("Enter class: \n");
        String newClas = sc.nextLine();
        System.out.println("Enter score: \n");
        float newScore = sc.nextFloat();
        Student newStudent = new Student(newId, newName, newGender, newDob, newClas, newScore);
        studentList.add(newStudent);
    }

    @Override
    public void removeStudent(int index) {
        index = sc.nextInt() - 1;
        studentList.remove(index);
    }

    @Override
    public void showListStudent() {
        for (Student student : studentList) {
            System.out.println(student.toString() + "\n");
        }
    }
}
