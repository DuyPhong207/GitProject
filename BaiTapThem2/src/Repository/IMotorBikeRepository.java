package Repository;

import Model.MotorBike;

import java.util.List;

public interface IMotorBikeRepository {
    void addMotorBike(MotorBike motorBike);
    void removeMotorBike(MotorBike motorBike);
    void searchMotorBike(String licensePlate);
    List<MotorBike> findAll();

}
