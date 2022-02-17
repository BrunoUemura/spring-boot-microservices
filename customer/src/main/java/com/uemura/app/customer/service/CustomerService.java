package com.uemura.app.customer.service;

import com.uemura.app.customer.model.Customer;
import com.uemura.app.customer.model.CustomerRegistrationRequest;
import com.uemura.app.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }
}
