package com.example.dao;

import java.util.List;

import com.example.domain.Customer;

public interface CustomerDAO {
	
	
	
	public List<Customer> getAllCustomers();
	public Customer createCustomer(Customer customer);
	public Customer getCustomerByID(String customerId);

}
