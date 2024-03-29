package model;

import java.sql.Date;

public class Booking {
    private String bookingId;
    private String dayStart;
    private String dayEnd;
    private int customerId;
    private String nameService;
    private String typeService;

    public Booking(String id, String dayStart, String dayEnd, int customerId, String nameService, String typeService) {
        this.bookingId = id;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerId = customerId;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public Booking() {

    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", dayStart=" + dayStart +
                ", dayEnd=" + dayEnd +
                ", customerId='" + customerId + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
