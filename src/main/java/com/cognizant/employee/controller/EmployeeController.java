package com.cognizant.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.model.Employee;
import com.cognizant.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

	@GetMapping("/getEmployees")
	public List<Employee> getEmployee()
	{
		return empService.getEmployeeList();
	}
}
