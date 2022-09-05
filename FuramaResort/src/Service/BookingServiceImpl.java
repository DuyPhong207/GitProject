package Service;

import Model.Booking;
import Repository.BookingRepository;
import Repository.BookingRepositoryImpl;

public class BookingServiceImpl implements BookingService{
    private BookingRepository repository = new BookingRepositoryImpl();
    @Override
    public void addNewBooking() {
        repository.addNewBooking();
    }

    @Override
    public void displayListBooking() {
        repository.displayListBooking();
    }
}
