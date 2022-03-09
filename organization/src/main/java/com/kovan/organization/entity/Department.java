package com.kovan.organization.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "department")
public class Department {
	
	@Id
	private int departmentId;
	
	private int departmentName;

}
