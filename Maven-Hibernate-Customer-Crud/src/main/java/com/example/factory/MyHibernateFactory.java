package com.example.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.domain.Customer;

public class MyHibernateFactory {
	private SessionFactory sessionFactory;

	private static MyHibernateFactory factory;

	private MyHibernateFactory() {

	}

	public SessionFactory getSessionFactory()
	{
		sessionFactory=new Configuration().configure().addAnnotatedClass(Customer.class).buildSessionFactory();
		return sessionFactory;
	}
	
	public static MyHibernateFactory getMyHibernateFactory()
	{
		if(factory==null)
		{
			factory=new MyHibernateFactory();
		}
		return factory;
	}


}
