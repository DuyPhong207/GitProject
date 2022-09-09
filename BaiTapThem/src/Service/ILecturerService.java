package Service;

import Model.Lecturer;

public interface ILecturerService {
    Lecturer getInfo();
    void addLecturer();
    void showList();
    void removeLecturer();
}
