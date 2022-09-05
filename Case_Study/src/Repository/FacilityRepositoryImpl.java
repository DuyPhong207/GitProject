package Repository;

import Model.Facility;

import java.util.ArrayList;

public class FacilityRepositoryImpl extends Service implements FacilityRepository{
    private ArrayList<Facility> facilityList;

    public FacilityRepositoryImpl(ArrayList<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    @Override
    public void displayListMaintenance() {

    }

    @Override
    public void displayList() {

    }

    @Override
    public void addNew() {

    }
}
