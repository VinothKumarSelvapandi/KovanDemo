package com.kovan.organization.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "employee")
public class Employee {
	
	@Id
	private int employeeId;
	
	private String employeeName;
	
	private String designation;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
	
	private Long salary;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "skillId")
	private List<Skill> skill;

}
