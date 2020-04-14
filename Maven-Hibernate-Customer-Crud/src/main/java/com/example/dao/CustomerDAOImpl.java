package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.domain.Customer;
import com.example.factory.MyHibernateFactory;

public class CustomerDAOImpl implements CustomerDAO {
	
	private  MyHibernateFactory factory=null;
	private SessionFactory sessionFactory=null;
	private Session session=null;
	
	{
		factory=MyHibernateFactory.getMyHibernateFactory();
		sessionFactory=factory.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Customer createCustomer(Customer customer) {
		
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		return customer;
	}
	public List<Customer> getAllCustomers() {
		List<Customer> list=session.createQuery("from Customer",Customer.class).list();
		
		return list;
	}
	public Customer getCustomerByID(String customerId) {
		// TODO Auto-generated method stub
		return session.get(Customer.class, customerId);
	}
	

}
