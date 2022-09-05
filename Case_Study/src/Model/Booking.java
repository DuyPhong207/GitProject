package Model;

import java.sql.Date;

public class Booking {
    private String bookingId;
    private Date dayStart;
    private Date dayEnd;
    private String customerId;
    private String nameService;
    private String typeService;

    public Booking(String id, Date dayStart, Date dayEnd, String customerId, String nameService, String typeService) {
        this.bookingId = id;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerId = customerId;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getDayStart() {
        return dayStart;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }

    public Date getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Date dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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
}
