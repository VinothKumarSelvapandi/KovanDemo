package com.kovan.organization.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@Entity
@Getter
@Setter
@ToString
@Table(name = "company")
public class Company {

	@Id
	private int companyId;
	
	private String comapanyName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "employeeId")
	private List<Employee> employee;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "departmentId")
	private List<Department> department;
}
