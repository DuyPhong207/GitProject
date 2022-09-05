package Service;

import Model.Lecturer;
import Repository.LecturerRepository;
import Repository.LecturerRepositoryImpl;

public class LecturerServiceImpl implements LecturerService {

    private LecturerRepository repository = new LecturerRepositoryImpl();

    @Override
    public void addNewLecturer() {
        repository.addNewLecturer();
    }

    @Override
    public void removeLecturer(int index) {
        repository.removeLecturer(index);
    }

    @Override
    public void showListLecturer() {
        repository.showListLecturer();
    }
}
