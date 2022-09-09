package Repository;

import Model.Car;

import java.util.List;

public interface ICarRepository {
    void addCar(Car car);
    void removeCar(Car car);
    void searchCar(String licensePlate);
    List<Car> findAll();
}
