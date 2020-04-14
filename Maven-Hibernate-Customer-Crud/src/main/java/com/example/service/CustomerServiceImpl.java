package com.example.service;

import java.util.List;

import com.example.dao.CustomerDAO;
import com.example.dao.CustomerDAOImpl;
import com.example.domain.Customer;




public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerDAO dao;
	
	{
		dao=new CustomerDAOImpl();
	}
	
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}
	

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}
	public Customer getCustomerByID(String customerId) {
		return dao.getCustomerByID(customerId);
	}

}
