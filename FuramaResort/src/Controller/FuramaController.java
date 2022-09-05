package Controller;

import Model.Employee;
import Service.*;

import java.util.Scanner;

public class FuramaController {
    private static BookingService bookingService = new BookingServiceImpl();
    private static ContractService contractService = new ContractServiceImpl();
    private static FacilityService facilityService = new FacilityServiceImpl();

    private static CustomerService customerService = new CustomerServiceImpl();
    private static EmployeeService employeeService = new EmployeeServiceImpl();
    private static VoucherService voucherService = new VoucherServiceImpl();
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("----Menu----\n"
                    + "1. Employee Management\n"
                    + "2. Customer Management\n"
                    + "3. Facility Management \n"
                    + "4. Booking Management\n"
                    + "5. Promotion Management\n"
                    + "6. Exit\n");
            System.out.println("Enter choose: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("----MENU Employee Management----\n"
                            + "1. Display list employees\n"
                            + "2. Add new employee\n"
                            + "3. Edit employee\n"
                            + "4. Return main menu\n");
                    System.out.println("Enter choose: ");
                    int nextChoose1 = sc.nextInt();
                    break;
                case 2:
                    System.out.println("----MENU Customer Management----\n"
                            + "1. Display list customer\n"
                            + "2. Add new customer\n"
                            + "3. Edit customer\n"
                            + "4. Return main menu\n");
                    System.out.println("Enter choose: ");
                    int nextChoose2 = sc.nextInt();
                    break;
                case 3:
                    System.out.println("----MENU Facility Management----\n"
                            + "1. Display list facility\n"
                            + "2. Add new facility\n"
                            + "3. Display list facility maintenance\n"
                            + "4. Return main menu\n");
                    System.out.println("Enter choose: ");

                    int nextChoose3 = sc.nextInt();

                    switch (nextChoose3) {
                        case 1:
                            facilityService.displayListFacility();
                            break;
                        case 2:
                            facilityService.addNewFacility();
                        case 3:
                            facilityService.displayListMaintenance();
                    }
                    break;
                case 4:
                    System.out.println("----MENU Booking Management----\n"
                            + "1. Add new booking\n"
                            + "2. Display list booking\n"
                            + "3. Create new contract\n"
                            + "4. Display list contract\n"
                            + "5. Edit contract\n"
                            + "6. Return main menu\n");
                    System.out.println("Enter choose: ");
                    int nextChoose4 = sc.nextInt();
                    switch (nextChoose4) {
                        case 1:
                            bookingService.addNewBooking();
                            break;
                        case 2:
                            bookingService.displayListBooking();
                            break;
                        case 3:
                            contractService.createNewContract();
                    }
                    break;
                case 5:
                    System.out.println("----MENU Promotion Management----\n"
                            + "1. Display list customer use service\n"
                            + "2. Display list customer get voucher\n"
                            + "3. Return main menu\n");
                    System.out.println("Enter choose: ");
                    int nextChoose5 = sc.nextInt();
                    break;
            }
        }
        while (choose != 6);
    }
}

