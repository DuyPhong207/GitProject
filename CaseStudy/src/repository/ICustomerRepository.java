package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void addCustomer(Customer customer);
    void editCustomer(int index, Customer customer);
}
