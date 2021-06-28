package com.cognizant.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.employee.model.Employee;

@Service
public class EmployeeService {

	private List<Employee> employeeList;
	
	public EmployeeService() {
		employeeList = new ArrayList<>();
		employeeList.add(new Employee(101,"Alex",23));
		employeeList.add(new Employee(102,"Bruce",24));
		employeeList.add(new Employee(103,"Charles",25));
	}
	
	public List<Employee> getEmployeeList()
	{
		return employeeList;
	}
	
}
