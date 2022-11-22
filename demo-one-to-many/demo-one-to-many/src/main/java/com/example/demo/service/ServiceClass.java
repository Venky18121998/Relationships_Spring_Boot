package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeTwo;

public interface ServiceClass {
	public Employee saveData(Employee employee);
	public EmployeeTwo save(EmployeeTwo employeeTwo);
	public List<Employee> getData();
	public List<EmployeeTwo> get();
	public List<Employee> value(String keyword);
	
	

}
