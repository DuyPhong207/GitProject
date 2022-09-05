package Model;

public class Villa extends Facility {
    private String roomStandrad;
    private int poolArea;
    private int numberOfFloor;

    public Villa(String serviceName, short area, short cost, int maxOfPeople, String rentType, String roomStandrad, int poolArea, int numberOfFloor) {
        super(serviceName, area, cost, maxOfPeople, rentType);
        this.roomStandrad = roomStandrad;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        super.toString();
        return "Villa{" +
                "roomStandrad='" + roomStandrad + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
