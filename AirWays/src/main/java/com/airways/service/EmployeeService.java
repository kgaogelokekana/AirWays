package com.airways.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airways.model.Employee;
import com.airways.repo.EmpoyeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmpoyeeRepo repo;
	
	public List<Employee> getAllEmployees (){
		List<Employee> employees = new ArrayList<>();
		repo.findAll().forEach(employees::add);
		return employees;
	}
	
	public Employee findOneById(int id) {
		return repo.findById(id).orElseThrow();
	}
	
	public void addEmployee(Employee employee) {
		repo.save(employee);
	}
	
	public void updateEmployee(int Id,Employee employee) {
		repo.save(employee);
	}
	
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

}
