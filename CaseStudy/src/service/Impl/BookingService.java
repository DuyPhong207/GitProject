package service.Impl;

import model.Booking;
import repository.IBookingRepository;
import repository.Impl.BookingRepository;
import service.IBookingService;

import java.util.Scanner;

public class BookingService implements IBookingService {
    private Scanner sc = new Scanner(System.in);
    private static IBookingRepository IBookingRepository = new BookingRepository();
    @Override
    public Booking infoBooking() {
        System.out.println("Enter booking code: \n");
        String bookingId = sc.nextLine();
        System.out.println("Enter start day: \n");
        String dayStart = sc.nextLine();
        System.out.println("Enter end day: \n");
        String dayEnd = sc.nextLine();
        System.out.println("Enter id of customer: \n");
        int customerId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of service: \n");
        String nameService = sc.nextLine();
        System.out.println("Enter type of service: \n");
        String typeService = sc.nextLine();
        Booking booking = new Booking(bookingId,dayStart,dayEnd,customerId,nameService,typeService);
        return booking;
    }

    @Override
    public void addBooking() {
        Booking booking = this.infoBooking();
        IBookingRepository.addBooking(booking);
    }

    @Override
    public void findAll() {
        for (Booking booking : IBookingRepository.findAll()) {
            System.out.println(booking.toString());
        }
    }
}
