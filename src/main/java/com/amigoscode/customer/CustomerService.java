package com.amigoscode.customer;

import java.util.List;

public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomer() {
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomer(Integer id) {
        return customerDao.selectCustomerById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "customer with [%d] not found".formatted(id))
                );
    }

}
