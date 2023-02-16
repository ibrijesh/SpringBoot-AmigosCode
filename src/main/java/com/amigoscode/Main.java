package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Main {


    public static void main(String[] args) {

        /* Never Do This
        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        CustomerController customerController = new CustomerController(customerService);
        */

        SpringApplication.run(Main.class, args);
    }


}
