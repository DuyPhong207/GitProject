package Model;

public class Facility {
    private String serviceName;
    private short area;
    private short cost;
    private int maxOfPeople;
    private String rentType;

    public Facility(String serviceName, short area, short cost, int maxOfPeople, String rentType) {
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.maxOfPeople = maxOfPeople;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public short getArea() {
        return area;
    }

    public void setArea(short area) {
        this.area = area;
    }

    public short getCost() {
        return cost;
    }

    public void setCost(short cost) {
        this.cost = cost;
    }

    public int getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(int maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxOfPeople=" + maxOfPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
