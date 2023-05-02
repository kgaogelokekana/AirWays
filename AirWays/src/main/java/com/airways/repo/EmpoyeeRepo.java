package com.airways.repo;

import org.springframework.data.repository.CrudRepository;

import com.airways.model.Employee;

public interface EmpoyeeRepo extends CrudRepository<Employee, Integer> {

}
