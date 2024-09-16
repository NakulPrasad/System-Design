package ECommerce;

import java.util.*;

public class CustomerService {
    private static CustomerService instance;
    private List<Customer> customers;

    CustomerService() {
        this.customers = new ArrayList<>();
    }

    public static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService();
        }
        return instance;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerById(int id) {
        for (Customer i : customers) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

}
