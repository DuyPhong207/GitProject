package Service.Impl;

import Model.Truck;
import Repository.ITruckRepository;
import Repository.Impl.TruckRepository;
import Service.ITruckService;

import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private ITruckRepository ITruckRepository = new TruckRepository();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void addTruck() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.println("Enter year product: ");
        int yearProduct = Integer.parseInt(sc.nextLine());
        System.out.println("Enter owner: ");
        String owner = sc.nextLine();
        System.out.println("Enter tonnage: ");
        float tonnage = Float.parseFloat(sc.nextLine());
        Truck truck = new Truck(licensePlate, manufacturer, yearProduct,owner,tonnage);
        ITruckRepository.addTruck(truck);
    }

    @Override
    public void removeTruck() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        Truck truck = new Truck(licensePlate);
        ITruckRepository.removeTruck(truck);
    }

    @Override
    public void searchTruck() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        ITruckRepository.searchTruck(licensePlate);
    }

    @Override
    public void findAll() {
        for (Truck truck : ITruckRepository.findAll()) {
            System.out.println(truck.toString());
        }
    }
}
