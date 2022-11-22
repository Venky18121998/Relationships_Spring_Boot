package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="oneto")
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="add_id")
	private Long addid;
	private String firstName;
	private String lastName;
	private String fathername;
	private String motherName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_emp_id",referencedColumnName = "add_id")
	private List<EmployeeTwo> employeetwo;
	
	

}
