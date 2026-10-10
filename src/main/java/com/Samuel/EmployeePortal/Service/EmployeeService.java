package com.Samuel.EmployeePortal.Service;

import java.util.List;

import com.Samuel.EmployeePortal.model.Employee;

//what to do
public interface EmployeeService {
	
	public abstract Employee createEmployee(Employee e);
	
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Integer empId);
	
	Employee updateEmployee(Employee employee, Integer empId);

	void deleteEmployeeById(Integer empId);
	
	Employee getEmployeeByName(String name);

	
}
