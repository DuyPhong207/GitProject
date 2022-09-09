package Service;

import Model.Student;

public interface IStudentService {
    Student getInfo();
    void addStudent();
    void showList();
    void removeStudent();
}
