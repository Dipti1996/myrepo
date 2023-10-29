package com.dj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.entity.Employee;
import com.dj.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository er;
	
	public List<Employee> getAllEmployees() {
		return er.getEmployees();
	}
	
	public void addEmployee(Employee e) {
		er.addEmployee(e);
	}
	public void deleteEmployee(String name) {
		er.delete(name);
	}
	
}
