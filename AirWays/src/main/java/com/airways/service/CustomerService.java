package com.airways.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airways.model.Customer;
import com.airways.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public List<Customer> getAllcustomers (){
		List<Customer> customers = new ArrayList<>();
		repo.findAll().forEach(customers::add);
		return customers;
	}
	
	public Customer findOneById(int id) {
		return repo.findById(id).orElseThrow();
	}
	
	public void addCustomer(Customer customer) {
		repo.save(customer);
	}
	
	public void updateCustomer(int Id,Customer customer) {
		repo.save(customer);
	}
	
	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}

}
