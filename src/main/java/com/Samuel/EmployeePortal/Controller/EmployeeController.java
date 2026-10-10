package com.Samuel.EmployeePortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Samuel.EmployeePortal.Service.EmployeeService;
import com.Samuel.EmployeePortal.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	

	@PostMapping("/data")
	Employee createEmployee(@RequestBody Employee e) {
		return employeeService.createEmployee(e);
		
	}
	
	@GetMapping("/getAllEmployee")
	List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getEmployee/empId/{empId}")
	Employee getEmployee(@PathVariable Integer empId){
		return employeeService.getEmployeeById(empId);
	}
	
	@GetMapping("/getEmployee/name/{name}")
	Employee getEmployee(@PathVariable String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	@PutMapping("update/{empId}")
	Employee updateEmployee(@RequestBody Employee e,@PathVariable Integer empId){
		return employeeService.updateEmployee(e, empId);	
	}
	
	@DeleteMapping("/delete/{empId}")
	String deleteEmployee(@PathVariable Integer empId) {
		employeeService.deleteEmployeeById(empId);
		return "Employee " +empId+" Deleted successfully";
	}
}
