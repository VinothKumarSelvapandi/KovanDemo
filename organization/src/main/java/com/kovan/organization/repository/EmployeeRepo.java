package com.kovan.organization.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kovan.organization.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findAllByOrderBySalaryDesc();
}
