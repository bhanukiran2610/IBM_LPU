package com.example;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static CustomerService service=null;
	private static Scanner scanner=new Scanner(System.in);
	static
	{
		service=new CustomerServiceImpl();
	}
	public static void main(String[] args) {
		String customerId,customerName,email;
		boolean activeStatus; 
		
		int choice=-1;
		do {
			System.out.println("1. Create Customer");
			System.out.println("2. Display All Available Customers");
			System.out.println("3. Display Student BY ID");
			System.out.print("enter your choice :");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the Customer Name :");
				customerName=scanner.next();
				System.out.print("Enter the Customer email: ");
				email=scanner.next();
				System.out.println("Enter the Customer Status :");
				activeStatus=scanner.nextBoolean();
				
				Customer customer=new Customer();
				customer.setCustomerName(customerName);
				customer.setCustomerEmail(email);
				customer.setActive(activeStatus);
				customer.setCustomerId(UUID.randomUUID().toString());
				
				customer=service.createCustomer(customer);
				System.out.println(customer);
				break;
			case 2:
				List<Customer> list=service.getAllCustomers();
				for(Customer s:list)
				{
					System.out.println(s);
				}
				break;
			case 3:
				System.out.print("Enter Customer ID: ");
				customer=service.getCustomerByID(scanner.next());
				if(customer==null)
				{
					System.out.println("No Such Student Found With given ID: ");
				}
				else
				{
					System.out.println(customer);
				}
				break;
				
				
				
			case 0:
				System.out.println("Bye!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice.");
				break;
			}
			
			
		} while (choice !=0);
	}
}
