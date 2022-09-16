package repository;

import model.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    void addFacility(Facility facility, Integer count);
    List<Facility> findListMaintenance();
    Map<Facility, Integer> findAll();
}
