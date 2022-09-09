package Repository.Impl;

import Model.Car;
import Model.Truck;
import Repository.ITruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    List<Truck> truckList = new ArrayList<>();
    @Override
    public void addTruck(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public void removeTruck(Truck truck) {
        truckList.remove(truck);
    }

    @Override
    public void searchTruck(String licensePlate) {
        Truck truck = new Truck(licensePlate);
    }

    @Override
    public List<Truck> findAll() {
        return truckList;
    }
}
