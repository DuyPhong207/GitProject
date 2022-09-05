package Repository;

import Model.Student;

public interface StudentRepository {
    void addStudent();
    void removeStudent(int index);
    void showListStudent();
}
