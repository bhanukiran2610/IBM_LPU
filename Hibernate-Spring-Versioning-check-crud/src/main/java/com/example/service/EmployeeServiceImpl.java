package com.example.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.dao.EmployeeDAOImpl;
import com.example.entity.Employee;


@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.createEmployee(employee);
	}

	public Collection<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAllEmployees();
	}

	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.findEmployee(id);
	}
	public Employee raiseEmployeeSalary(int id, long raise) {
		return dao.raiseEmployeeSalary(id, raise);
	}
	
	public void removeEmployee(int id) {
		dao.removeEmployee(id);
	}

}
