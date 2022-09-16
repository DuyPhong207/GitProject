package repository.Impl;

import model.Booking;
import repository.IBookingRepository;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository {
    private static List<Booking> bookingList = new ArrayList<>();

    @Override
    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }

    @Override
    public List<Booking> findAll() {
        return bookingList;
    }
}
