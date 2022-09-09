package Repository.Impl;

import Model.Student;
import Repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private List<Student> studentList = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void removeStudent(Student student) {
        studentList.remove(student);
    }
}
