package Model;

public class Truck extends Vehicle {
    private float tonnage;

    public Truck(String licensePlate, String manufacturer, int yearProduct, String owner, float tonnage) {
        super(licensePlate, manufacturer, yearProduct, owner);
        this.tonnage = tonnage;
    }

    public Truck() {

    }

    public Truck(String licensePlate) {
        this.getLicensePlate();
    }

    public float getTonnage() {
        return tonnage;
    }

    public void setTonnage(float tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tonnage=" + tonnage +
                '}';
    }
}
