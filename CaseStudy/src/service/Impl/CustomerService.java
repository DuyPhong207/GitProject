package service.Impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.Impl.CustomerRepository;
import service.ICustomerService;

import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private Scanner sc = new Scanner(System.in);
    private ICustomerRepository ICustomerRepository = new CustomerRepository();

    @Override
    public void addCustomer() {

    }

    @Override
    public Customer infoCustomer() {
        System.out.println("Enter id of customer: \n");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of customer: \n");
        String name = sc.nextLine();
        System.out.println("Enter date of birth customer: \n");
        String dob = sc.nextLine();
        System.out.println("Enter gender of customer: \n");
        String gender = sc.nextLine();
        System.out.println("Enter cmnd of customer: \n");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.println("Enter phone of customer: \n");
        String phone = sc.nextLine();
        System.out.println("Enter email of customer: \n");
        String email = sc.nextLine();
        System.out.println("Enter type of customer: \n");
        String type = sc.nextLine();
        System.out.println("Enter address of customer: \n");
        String address = sc.nextLine();
        Customer customer = new Customer(id, name, dob, gender, cmnd, phone, email, type, address);
        return customer;
    }

    @Override
    public void findAll() {
        for (Customer customer : ICustomerRepository.findAll()) {
            System.out.println(customer.toString());
        }
    }
}
