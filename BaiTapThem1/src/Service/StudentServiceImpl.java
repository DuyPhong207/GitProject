package Service;

import Model.Student;
import Repository.StudentRepository;
import Repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{

    private StudentRepository repository = new StudentRepositoryImpl();
    @Override
    public void addStudent() {
        repository.addStudent();
    }

    @Override
    public void removeStudent(int index) {
        repository.removeStudent(index);
    }

    @Override
    public void showListStudent() {
        repository.showListStudent();
    }
}
