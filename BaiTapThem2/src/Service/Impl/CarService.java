package Service.Impl;

import Model.Car;
import Repository.ICarRepository;
import Repository.Impl.CarRepository;
import Service.ICarService;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private ICarRepository ICarRepository = new CarRepository();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void addCar() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.println("Enter year product: ");
        int yearProduct = Integer.parseInt(sc.nextLine());
        System.out.println("Enter owner: ");
        String owner = sc.nextLine();
        System.out.println("Enter number of seat: ");
        byte numberOfSeat = Byte.parseByte(sc.nextLine());
        System.out.println("Enter type of car: ");
        String typeCar = sc.nextLine();
        Car car = new Car(licensePlate,manufacturer,yearProduct,owner,numberOfSeat,typeCar);
        ICarRepository.addCar(car);
    }

    @Override
    public void removeCar() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        Car car = new Car(licensePlate);
        ICarRepository.removeCar(car);
    }

    @Override
    public void searchCar() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        ICarRepository.searchCar(licensePlate);
    }

    @Override
    public void findAll() {
        for (Car car : ICarRepository.findAll()) {
            System.out.println(car.toString());
        }
    }
}
