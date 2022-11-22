package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeTwo;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeTwoRepository;
import com.example.demo.service.ServiceClass;

@Service
public class ServiceImplClass implements ServiceClass{
	@Autowired
	EmployeeRepository  employeeRepository;
	
	@Autowired
	EmployeeTwoRepository employeeTwoRepository;

	@Override
	public Employee saveData(Employee employee) {
	Employee add = employeeRepository.save(employee);
		return add;
	}

	@Override
	public EmployeeTwo save(EmployeeTwo employeeTwo) {
	EmployeeTwo addi = employeeTwoRepository.save(employeeTwo);
		return addi;
	}

	@Override
	public List<Employee> getData() {
		List<Employee> adding = new ArrayList<Employee>();
	List<Employee> hello = employeeRepository.findAll();
		return hello;
	}

	@Override
	public List<EmployeeTwo> get() {
		List<EmployeeTwo> getting = new ArrayList<EmployeeTwo>();
	List<EmployeeTwo> add = employeeTwoRepository.findAll();
		return add;
	}

	@Override
	public List<Employee> value(String keyword) {
		
		return  employeeRepository.getValueBy(keyword);
	}

}
