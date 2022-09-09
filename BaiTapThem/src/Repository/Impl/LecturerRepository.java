package Repository.Impl;

import Model.Lecturer;
import Repository.ILecturerRepository;

import java.util.ArrayList;
import java.util.List;

public class LecturerRepository implements ILecturerRepository {
    private static List<Lecturer> lecturerList = new ArrayList<Lecturer>();

    @Override
    public void addLecturer(Lecturer lecturer) {
        lecturerList.add(lecturer);
    }

    @Override
    public List<Lecturer> getAll() {
        return lecturerList;
    }

    @Override
    public void removeLecturer(Lecturer lecturer) {
        lecturerList.remove(lecturer);
    }
}
