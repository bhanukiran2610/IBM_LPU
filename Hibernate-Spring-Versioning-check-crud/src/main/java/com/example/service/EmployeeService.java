package com.example.service;

import java.util.Collection;

import com.example.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	public void removeEmployee(int id);

	public Employee raiseEmployeeSalary(int id, long raise);

	public Employee findEmployee(int id);

	public Collection<Employee> findAllEmployees();


}
