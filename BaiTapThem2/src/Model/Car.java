package Model;

public class Car extends Vehicle{
    private byte numberOfSeat;
    private String typeCar;

    public Car(String licensePlate, String manufacturer, int yearProduct, String owner, byte numberOfSeat, String typeCar) {
        super(licensePlate, manufacturer, yearProduct, owner);
        this.numberOfSeat = numberOfSeat;
        this.typeCar = typeCar;
    }

    public Car(String licensePlate) {
        this.getLicensePlate();
    }

    public byte getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(byte numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfSeat=" + numberOfSeat +
                ", typeCar='" + typeCar + '\'' +
                '}';
    }
}
