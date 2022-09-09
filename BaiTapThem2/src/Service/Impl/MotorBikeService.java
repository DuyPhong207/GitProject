package Service.Impl;

import Model.MotorBike;
import Repository.IMotorBikeRepository;
import Repository.Impl.MotorBikeRepository;
import Service.IMotorBikeService;

import java.util.List;
import java.util.Scanner;

public class MotorBikeService implements IMotorBikeService {
    private IMotorBikeRepository IMotorbikeRepository = new MotorBikeRepository();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void addMotorBike() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.println("Enter year product: ");
        int yearProduct = Integer.parseInt(sc.nextLine());
        System.out.println("Enter owner: ");
        String owner = sc.nextLine();
        System.out.println("Enter wattage: ");
        short wattage = Short.parseShort(sc.nextLine());
        MotorBike motorBike = new MotorBike(licensePlate,manufacturer,yearProduct,owner,wattage);
        IMotorbikeRepository.addMotorBike(motorBike);
    }

    @Override
    public void removeMotorBike() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        MotorBike motorBike = new MotorBike(licensePlate);
        IMotorbikeRepository.removeMotorBike(motorBike);
    }

    @Override
    public void searchMotorBike() {
        System.out.println("Enter license plate: ");
        String licensePlate = sc.nextLine();
        IMotorbikeRepository.searchMotorBike(licensePlate);
    }

    @Override
    public void findAll() {
        for (MotorBike motorBike : IMotorbikeRepository.findAll()) {
            System.out.println(motorBike.toString());
        }
    }
}
