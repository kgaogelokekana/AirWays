package com.airways.repo;

import org.springframework.data.repository.CrudRepository;

import com.airways.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
	Customer findByEmail(String email);

}
