package Repository;

import Model.Lecturer;

public interface LecturerRepository {
    void addNewLecturer();
    void removeLecturer(int index);
    void showListLecturer();
}
