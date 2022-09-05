package Model;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceName, short area, short cost, int maxOfPeople, String rentType, String freeService) {
        super(serviceName, area, cost, maxOfPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        super.toString();
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
