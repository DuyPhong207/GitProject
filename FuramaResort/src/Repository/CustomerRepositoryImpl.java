package Repository;

import Model.Customer;

import java.util.ArrayList;

public class CustomerRepositoryImpl implements CustomerRepository {
    private ArrayList<Customer> customerList;

    @Override
    public void addNewCustomer(Customer newCustomer) {
        this.customerList.add(newCustomer);
    }

    @Override
    public void displayListCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void editCustomer() {

    }
}
