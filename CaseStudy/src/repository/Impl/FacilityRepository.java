package repository.Impl;

import model.Facility;
import repository.IFacilityRepository;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static List<Facility> facilityMaintenanceList = new ArrayList<>();
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    @Override
    public void addFacility(Facility facility, Integer count) {
        facilityList.put(facility, count);
    }

    @Override
    public List<Facility> findListMaintenance() {
        return facilityMaintenanceList;
    }

    @Override
    public Map<Facility, Integer> findAll() {
        return facilityList;
    }
}
