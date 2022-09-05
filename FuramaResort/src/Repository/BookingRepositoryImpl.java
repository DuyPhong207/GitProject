package Repository;

import Model.Booking;

import java.util.ArrayList;

import java.util.Scanner;

public class BookingRepositoryImpl implements BookingRepository {
    private ArrayList<Booking> bookingList;
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingList) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNewBooking() {
        System.out.println("Enter booking ID: ");
        String newBookingId = sc.nextLine();
        System.out.println("Enter day start: ");
        String newDayStart = sc.nextLine();
        System.out.println("Enter day end: ");
        String newDayEnd = sc.nextLine();
        System.out.println("Enter customer ID: ");
        String newCustomerId = sc.nextLine();
        System.out.println("Enter name service: ");
        String newNameService = sc.nextLine();
        System.out.println("Enter type service");
        String newTypeService = sc.nextLine();
        Booking newBooking = new Booking(newBookingId, newDayStart, newDayEnd, newCustomerId, newNameService, newTypeService);
        this.bookingList.add(newBooking);
    }
}
