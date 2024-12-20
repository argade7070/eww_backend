package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@RestController
@RequestMapping("api/employees")

public class EmpController {
	@Autowired
	private EmployeeService empService;

	
	@GetMapping("getEmp")
	public List<Employee> getAllEmployees(){
		
		
		List<Employee> emp=empService.getAllEmployees();
		System.out.println("emplist"+emp);
		return empService.getAllEmployees();
		
		
	
		
	}

}
