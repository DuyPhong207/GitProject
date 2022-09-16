package service.Impl;

import model.Facility;
import repository.IFacilityRepository;
import repository.Impl.FacilityRepository;
import service.IFacilityService;

import java.util.*;

public class FacilityService implements IFacilityService {
    private IFacilityRepository IFacilityRepository = new FacilityRepository();
    private Scanner sc = new Scanner(System.in);
    private int choice;
    @Override
    public void addNew() {
        System.out.println("1. Add new villa.\n"+
                "2. Add new house.\n"+
                "3. Add new room.");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Enter name of service:");
                String serviceName = sc.nextLine();
                System.out.println("Enter area of service:");
                Short area = Short.parseShort(sc.nextLine());

        }
    }

    @Override
    public void findAll() {
        Map map = IFacilityRepository.findAll();
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println("Facility: " + key + " Number of uses: " + map.get(key));
        }
    }

    @Override
    public void findListMaintenance() {

    }
}
