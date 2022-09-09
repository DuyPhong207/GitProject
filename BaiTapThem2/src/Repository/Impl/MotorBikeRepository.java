package Repository.Impl;

import Model.Car;
import Model.MotorBike;
import Repository.IMotorBikeRepository;
import Service.IMotorBikeService;

import java.util.ArrayList;
import java.util.List;

public class MotorBikeRepository implements IMotorBikeRepository {
    private List<MotorBike> motorBikeList = new ArrayList<>();

    @Override
    public void addMotorBike(MotorBike motorBike) {
        motorBikeList.add(motorBike);
    }

    @Override
    public void removeMotorBike(MotorBike motorBike) {
        motorBikeList.remove(motorBike);
    }

    @Override
    public void searchMotorBike(String licensePlate) {
        MotorBike motorBike = new MotorBike(licensePlate);
        int index = motorBikeList.indexOf(motorBike);
        motorBikeList.get(index);
    }

    @Override
    public List<MotorBike> findAll() {
        return motorBikeList;
    }
}
