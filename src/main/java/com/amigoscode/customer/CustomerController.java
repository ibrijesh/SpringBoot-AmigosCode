package com.amigoscode.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

     /*
    @RequestMapping(
            path = "/api/v1/customers",
            method = RequestMethod.GET
    )
    */
    //           OR

    @GetMapping("/api/v1/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/api/v1/customers/{customerId}")
    public Customer getCustomerById(
            @PathVariable("customerId") Integer customerId) {

        return customerService.getCustomer(customerId);
    }
}
