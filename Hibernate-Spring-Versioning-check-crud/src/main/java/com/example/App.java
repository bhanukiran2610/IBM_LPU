package com.example;

import java.util.Collection;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.EmployeeDAO;
import com.example.dao.EmployeeDAOImpl;
import com.example.entity.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int choice=0;
    	Scanner scanner=new Scanner(System.in);
    
        do {
        	System.out.println();
        	System.out.println("1.Insert the values ");
        	System.out.println("2.remove by id");
        	System.out.println("3.raise the salery of employee");
        	System.out.println("4.fill all  employees ");
        	System.out.println("0.exit");
        	
        	choice=scanner.nextInt();
        	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        	//EmployeeDAO dao = context.getBean("dao", EmployeeDAOImpl.class);
        	EmployeeService service=context.getBean("employeeServiceImpl",EmployeeServiceImpl.class);
        	Employee employee=context.getBean("employee",Employee.class);
        	switch(choice) {
        	case 1:
        		Employee e = service.createEmployee(new Employee("Sachin", 20000));
        		System.out.println("done!" + e);
        		break;
        	case 2:
        		service.removeEmployee(1);
        		break;
        	case 3:
        		Employee emp = service.raiseEmployeeSalary(2, 1000);
        		if (emp == null) {
        			System.out.println("raise salary aborted.");
        		} else {
        			System.out.println("Updated Employee: " + emp);
        		}
        		break;
        	case 4:
        		Collection<Employee> collection = service.findAllEmployees();
        		for (Employee emp1 : collection) {
        				System.out.println(emp1);
        			}
        		break;
        	case 0:
        		System.out.println("Bye!!");
        		break;
        		
        	default:
        		break;
        	}
        }while(choice!=0);
	}
}