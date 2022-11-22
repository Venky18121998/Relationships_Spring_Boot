package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeTwo;
import com.example.demo.service.ServiceClass;

@RestController
public class ControllerClass {
	@Autowired
	ServiceClass serviceClass;
	
	@PostMapping("/value")
	public  Employee saveDetailes(@RequestBody Employee employee ){
	Employee hello = serviceClass.saveData(employee);
		return hello;
		
		
	}
	@PostMapping("/valuetwo")
	public EmployeeTwo save(@RequestBody EmployeeTwo employeeTwo) {
	EmployeeTwo bye = serviceClass.save(employeeTwo);
		return bye;
		
	}
	@GetMapping("/getone")
	public List<Employee> getvalues(){
		return serviceClass.getData();
		
	}
	
	@GetMapping("/gettwo")
	public List<EmployeeTwo> getone(){
		return serviceClass.get();
		
	}
	@GetMapping("/get/{keyword}")
	public List<Employee> value(@PathVariable String keyword){
		return serviceClass.value(keyword);
		
	}
	

}
