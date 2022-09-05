package Controller;

public class FuramaController {
    public void displayMainMenu() {
        System.out.println("----Menu----"
                + "1. Employee Management\n"
                + "2. Customer Management\n"
                + "3. Facility Management \n"
                + "4. Booking Management\n"
                + "5. Promotion Management\n"
                + "6. Exit");
    }

    public void displayEmployeeManagement() {
        System.out.println("----MENU Employee Management----"
                + "1. Display list employees"
                + "2. Add new employee"
                + "3. Edit employee"
                + "4. Return main menu");
    }

    public void displayCustomerManagement() {
        System.out.println("----MENU Customer Management----"
                + "1. Display list customer"
                + "2. Add new customer"
                + "3. Edit customer"
                + "4. Return main menu");
    }

    public void displayFacilityManagement() {
        System.out.println("----MENU Facility Management----"
                + "1. Display list facility"
                + "2. Add new facility"
                + "3. Edit facility"
                + "4. Return main menu");
    }

    public void displayBookingManagerment() {
        System.out.println("----MENU Booking Management----"
                + "1. Add new booking"
                + "2. Display list booking"
                + "3. Create new constracts"
                + "4. Display list contracts"
                + "5. Edit contracts"
                + "6. Return main menu");
    }

    public void displayPromotionManagement() {
        System.out.println("----MENU Promotion Management----"
                + "1. Display list customer use service"
                + "2. Display list customer get voucher"
                + "3. Return main menu");
    }
}
