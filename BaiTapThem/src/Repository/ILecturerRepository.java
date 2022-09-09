package Repository;

import Model.Lecturer;

import java.util.List;

public interface ILecturerRepository {
    void addLecturer(Lecturer lecturer);
    List<Lecturer> getAll();
    void removeLecturer(Lecturer lecturer);
}
