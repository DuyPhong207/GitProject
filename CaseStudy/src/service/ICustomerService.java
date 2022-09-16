package service;

import model.Customer;
import service.Impl.CustomerService;

public interface ICustomerService {
    void addCustomer();
    Customer infoCustomer();
    void findAll();
}
