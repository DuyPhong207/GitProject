package Repository;

import Model.Student;

import java.util.List;

public interface IStudentRepository {
    void addStudent(Student student);
    List<Student> getAll();

    void removeStudent(Student student);
}
