package Model;

public class House extends Facility {
    private String roomStandrad;
    private int numberOfFloor;

    public House(String serviceName, short area, short cost, int maxOfPeople, String rentType, String roomStandrad, int numberOfFloor) {
        super(serviceName, area, cost, maxOfPeople, rentType);
        this.roomStandrad = roomStandrad;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandrad() {
        return roomStandrad;
    }

    public void setRoomStandrad(String roomStandrad) {
        this.roomStandrad = roomStandrad;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

}
