package com.kovan.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kovan.organization.entity.Employee;
import com.kovan.organization.repository.CompanyRepo;
import com.kovan.organization.repository.EmployeeRepo;

@RestController
public class RequestController {

	@Autowired
	EmployeeRepo employeeRepo;

	//Add or Update Employee
	@GetMapping("/addOrUpdateEmployee")
	public String addOrUpdateEmployee(Employee employee) {
		employeeRepo.save(employee);
		return "Employee Record Added/Updated";
	}
	
	@GetMapping("/deleteEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable("employeeId")int employeeId) {
		employeeRepo.deleteById(employeeId);
		return "Employee Record Deleted";
	}
	
	@GetMapping("/getEmployees")
	public String getEmployees() {
		return employeeRepo.findAllByOrderBySalaryDesc().toString();
	}

}
