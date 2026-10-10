package com.Samuel.EmployeePortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Samuel.EmployeePortal.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Employee findByname(String name);
}
