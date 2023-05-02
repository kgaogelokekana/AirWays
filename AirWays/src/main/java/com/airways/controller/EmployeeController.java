package com.airways.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airways.model.Employee;
import com.airways.service.EmployeeService;

@RestController
@RequestMapping("/v1/app")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		 service.addEmployee(employee);
	}
	
	@GetMapping("/employees/{id}")
	public Employee getOneEmployee(@PathVariable int id) {
		return service.findOneById(id);
	}
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
		 service.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id){
		service.deleteEmployee(id);
	}

}
