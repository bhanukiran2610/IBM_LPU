package com.example.service;

import java.util.List;

import com.example.domain.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public Customer createCustomer(Customer customer);
	public Customer getCustomerByID(String customerId);
}
