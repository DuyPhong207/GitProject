package Repository.Impl;

import Model.Car;
import Repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    List<Car> carList = new ArrayList<>();
    @Override
    public void addCar(Car car) {
        carList.add(car);
    }

    @Override
    public void removeCar(Car car) {
        carList.remove(car);
    }

    @Override
    public void searchCar(String licensePlate) {
        Car car = new Car(licensePlate);
        int index = carList.indexOf(car);
        carList.get(index);
    }

    @Override
    public List<Car> findAll() {
        return carList;
    }
}
