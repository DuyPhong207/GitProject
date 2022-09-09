package Model;

import java.util.Objects;

public class Vehicle {
    private String licensePlate;
    private String manufacturer;
    private int yearProduct;
    private String owner;

    public Vehicle(String licensePlate, String manufacturer, int yearProduct, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.yearProduct = yearProduct;
        this.owner = owner;
    }

    public Vehicle() {

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearProduct=" + yearProduct +
                ", owner='" + owner + '\'' +
                '}';
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearProduct() {
        return yearProduct;
    }

    public void setYearProduct(int yearProduct) {
        this.yearProduct = yearProduct;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(licensePlate, vehicle.licensePlate);
    }
}
