package Repository;

import Model.Truck;

import java.util.List;

public interface ITruckRepository {
    void addTruck(Truck truck);
    void removeTruck(Truck truck);
    void searchTruck(String licensePlate);
    List<Truck> findAll();

}
