package Controller;

import Service.ICarService;
import Service.IMotorBikeService;
import Service.ITruckService;
import Service.Impl.CarService;
import Service.Impl.MotorBikeService;
import Service.Impl.TruckService;

import java.util.Scanner;

public class VehicleController {
    private static ICarService ICarService = new CarService();
    private static IMotorBikeService IMotorBikeService = new MotorBikeService();
    private static ITruckService ITruckService = new TruckService();
    private static Scanner sc = new Scanner(System.in);
    private static int choice;

    public static void main(String[] args) {
        while (true) {
            System.out.println("---- Menu manager vehicle ----\n" +
                    "1. Car\n" +
                    "2. Motor bike\n" +
                    "3. Truck\n" +
                    "4. Exit.");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("---- Car menu ----\n" +
                                "1. Add new.\n" +
                                "2. Remove\n" +
                                "3. Search\n" +
                                "4. Show list\n" +
                                "5. Return main menu.");
                        int choiceCar = Integer.parseInt(sc.nextLine());
                        switch (choiceCar) {
                            case 1:
                                ICarService.addCar();
                                break;
                            case 2:
                                ICarService.removeCar();
                                break;
                            case 3:
                                ICarService.searchCar();
                                break;
                            case 4:
                                ICarService.findAll();
                            case 5:
                                return;
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("---- Motor bike menu ----\n" +
                                "1. Add new.\n" +
                                "2. Remove\n" +
                                "3. Search\n" +
                                "4. Show list\n" +
                                "5. Return main menu.");
                        int choiceMotorbike = Integer.parseInt(sc.nextLine());
                        switch (choiceMotorbike) {
                            case 1:
                                IMotorBikeService.addMotorBike();
                                break;
                            case 2:
                                IMotorBikeService.removeMotorBike();
                                break;
                            case 3:
                                IMotorBikeService.searchMotorBike();
                                break;
                            case 4:
                                IMotorBikeService.findAll();
                            case 5:
                                return;
                        }

                    }
                case 3:
                    while (true) {
                        System.out.println("---- Truck menu ----\n" +
                                "1. Add new.\n" +
                                "2. Remove\n" +
                                "3. Search\n" +
                                "4. Show list\n" +
                                "5. Return main menu.");
                        int choiceTruck = Integer.parseInt(sc.nextLine());
                        switch (choiceTruck) {
                            case 1:
                                ITruckService.addTruck();
                                break;
                            case 2:
                                ITruckService.removeTruck();
                                break;
                            case 3:
                                ITruckService.searchTruck();
                                break;
                            case 4:
                                ITruckService.findAll();
                            case 5:
                                return;
                        }
                    }
                case 4:
                    System.exit(0);

            }
        }
    }
}
