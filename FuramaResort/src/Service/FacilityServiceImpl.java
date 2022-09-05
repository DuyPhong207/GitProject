package Service;

import Model.Facility;
import Repository.FacilityRepository;
import Repository.FacilityRepositoryImpl;

public class FacilityServiceImpl implements FacilityService {
    FacilityRepository repository = new FacilityRepositoryImpl();

    @Override
    public void displayListFacility() {
        repository.displayListFacility();
    }

    @Override
    public void addNewFacility() {
        repository.addNewFacility();
    }

    @Override
    public void displayListMaintenance() {

    }
}
