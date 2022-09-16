package service;

import model.Booking;

public interface IBookingService {
    Booking infoBooking();
    void addBooking();
    void findAll();
}
