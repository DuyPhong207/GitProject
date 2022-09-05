package Service;

import Model.Customer;

public interface CustomerService {
    void addNewCustomer(Customer newCustomer);
    void displayListCustomer();
    void editCustomer();
}
