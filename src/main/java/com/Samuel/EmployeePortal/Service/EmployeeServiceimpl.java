package com.Samuel.EmployeePortal.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Samuel.EmployeePortal.Repo.EmployeeRepo;
import com.Samuel.EmployeePortal.model.Employee;

//how to do
@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public Employee createEmployee(Employee e) {
		return employeeRepo.save(e);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		return employeeRepo.findById(empId).get();
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return employeeRepo.findByname(name);
	}
	
	@Override
	public Employee updateEmployee(Employee e, Integer empId) {
		Employee employeeInfofromDB = getEmployeeById(empId);
		employeeInfofromDB.setName(e.getName());
		employeeInfofromDB.setAddress(e.getAddress());
		employeeInfofromDB.setDepartment(e.getDepartment());
		employeeInfofromDB.setDesignation(e.getDesignation());
		employeeInfofromDB.setEmail(e.getEmail());
		employeeInfofromDB.setGender(e.getGender());
		employeeInfofromDB.setJoiningDate(e.getJoiningDate());
		employeeInfofromDB.setPhone(e.getPhone());
		employeeInfofromDB.setSalary(e.getSalary());
		
		return employeeRepo.save(employeeInfofromDB);
	}

	@Override
	public void deleteEmployeeById(Integer empId) {
		employeeRepo.deleteById(empId);

	}



}
