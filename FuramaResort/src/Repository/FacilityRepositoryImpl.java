package Repository;

import Model.Facility;
import Model.House;
import Model.Room;
import Model.Villa;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FacilityRepositoryImpl implements FacilityRepository {
    private ArrayList<Facility> facilityList;
    Scanner sc = new Scanner(System.in);

    public FacilityRepositoryImpl(ArrayList<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    public FacilityRepositoryImpl() {

    }

    @Override
    public void displayListFacility() {
        for (Facility facility : facilityList) {
            System.out.println(facility.toString());
        }
    }

    @Override
    public void addNewFacility() {
        System.out.println("----Menu add new facility----\n"
                + "1. Add new villa\n"
                + "2. Add new house\n"
                + "3. Add new room\n");
        System.out.println("Enter choose: ");
        int facilityChoose = sc.nextInt();

        if (facilityChoose == 1) {
            System.out.println("Enter name service: \n");
            String newNameService = sc.nextLine();
            System.out.println("Enter area: ");
            short newArea = sc.nextShort();
            System.out.println("Enter cost: ");
            short newCost = sc.nextShort();
            System.out.println("Enter max of people: ");
            int newMaxOfPeople = sc.nextInt();
            System.out.println("Enter type rent: ");
            String newRentType = sc.nextLine();
            System.out.println("Enter room standard");
            String newRoomStandard = sc.nextLine();
            System.out.println("Enter pool area");
            int newPoolArea = sc.nextInt();
            System.out.println("Enter number of floor");
            int newNumberOfFloor = sc.nextInt();
            Villa newVilla = new Villa(newNameService, newArea, newCost, newMaxOfPeople, newRentType, newRoomStandard, newPoolArea, newNumberOfFloor);
            this.facilityList.add(newVilla);
        } else if (facilityChoose == 2) {
            System.out.println("Enter name service: ");
            String newNameService = sc.nextLine();
            System.out.println("Enter area: ");
            short newArea = sc.nextShort();
            System.out.println("Enter cost: ");
            short newCost = sc.nextShort();
            System.out.println("Enter max of people: ");
            int newMaxOfPeople = sc.nextInt();
            System.out.println("Enter type rent: ");
            String newRentType = sc.nextLine();
            System.out.println("Enter room standard");
            String newRoomStandard = sc.nextLine();
            System.out.println("Enter number of floor");
            int newNumberOfFloor = sc.nextInt();
            House newHouse = new House(newNameService, newArea, newCost, newMaxOfPeople, newRentType, newRoomStandard, newNumberOfFloor);
            this.facilityList.add(newHouse);
        } else if (facilityChoose == 3) {
            System.out.println("Enter name service: ");
            String newNameService = sc.nextLine();
            System.out.println("Enter area: ");
            short newArea = sc.nextShort();
            System.out.println("Enter cost: ");
            short newCost = sc.nextShort();
            System.out.println("Enter max of people: ");
            int newMaxOfPeople = sc.nextInt();
            System.out.println("Enter type rent: ");
            String newRentType = sc.nextLine();
            System.out.println("Enter free service");
            String newFreeService = sc.nextLine();
            Room newRoom = new Room(newNameService, newArea, newCost, newMaxOfPeople, newRentType, newFreeService);
            this.facilityList.add(newRoom);
        }
    }

    @Override
    public void displayListMaintenance() {

    }
}
