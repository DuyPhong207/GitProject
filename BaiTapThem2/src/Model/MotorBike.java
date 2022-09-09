package Model;

public class MotorBike extends Vehicle{
    private short wattage;

    public MotorBike(String licensePlate, String manufacturer, int yearProduct, String owner, short wattage) {
        super(licensePlate, manufacturer, yearProduct, owner);
        this.wattage = wattage;
    }

    public MotorBike() {
    }

    public MotorBike(String licensePlate) {
        this.getLicensePlate();
    }

    public short getWattage() {
        return wattage;
    }

    public void setWattage(short wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "wattage=" + wattage +
                '}';
    }
}
