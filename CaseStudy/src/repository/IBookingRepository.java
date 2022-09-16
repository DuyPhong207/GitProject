package repository;

import model.Booking;

import java.util.List;

public interface IBookingRepository {
    void addBooking(Booking booking);
    List<Booking> findAll();
}
