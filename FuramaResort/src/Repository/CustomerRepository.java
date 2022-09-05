package Repository;

import Model.Customer;

public interface CustomerRepository {
    void addNewCustomer(Customer newCustomer);
    void displayListCustomer();
    void editCustomer();
}
