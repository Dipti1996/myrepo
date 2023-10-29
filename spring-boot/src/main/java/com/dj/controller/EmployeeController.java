package com.dj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dj.entity.Employee;
import com.dj.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	
	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployees(){
		return es.getAllEmployees();
	}
	
	@PostMapping("/addEmp")
	public void addEmployee(@RequestBody Employee e) {
		es.addEmployee(e);
	}
	@DeleteMapping("/delEmp")
	public void deleteEmployee(@RequestParam String name) {
		es.deleteEmployee(name);
	}

}
