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

import com.airways.model.Customer;
import com.airways.service.CustomerService;

@RestController
@RequestMapping("/v1/app")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return service.getAllcustomers();
	}
	
	@PostMapping("/customers")
	public void addCustomer(@RequestBody Customer customers) {
		 service.addCustomer(customers);
	}
	
	@GetMapping("/customers/{id}")
	public Customer getOneCustomer(@PathVariable int id) {
		return service.findOneById(id);
	}
	
	@GetMapping("customer/email/{email}")
	public Customer getCustomerByEmail(@PathVariable(name = "email") String email) {
		return service.findOneEmail(email);
	}
	
	@PutMapping("/customers/{id}")
	public void updateCustomer(@PathVariable int id,@RequestBody Customer easyflight) {
		 service.updateCustomer(id, easyflight);
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id){
		service.deleteCustomer(id);
	}

}
