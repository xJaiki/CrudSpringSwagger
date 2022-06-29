package com.jaiki.CRUDSpringSwagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaiki.CRUDSpringSwagger.model.Customer;
import com.jaiki.CRUDSpringSwagger.repository.CustomerRepository;


@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	public CustomerController(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@GetMapping("/customer")
	Iterable <Customer> getCustomer(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/customer/{id}")
	Customer getCustomer(@PathVariable int id) {
		return customerRepository.findById(id).orElseThrow(null);		
	}
	
	@PostMapping("/customer")
	Customer insertCustomer(@RequestBody Customer newCustomer) {
		return customerRepository.save(newCustomer);
	}
	
	@DeleteMapping("/customer/{id}")
	String deleteCliente(@PathVariable int id) {	
		customerRepository.deleteById(id);
	return "ID number : "+id+" deleted!";
	}
	
	@PutMapping("/customer/{id}")
	Customer updateCustomer(@PathVariable int id,@RequestBody Customer newCustomer ) {
	Customer customerToUpdate = customerRepository.findById(id).orElseThrow(null);
	customerToUpdate.setName(newCustomer.getName());
	customerToUpdate.setLastname(newCustomer.getLastname());
	customerToUpdate.setAge(newCustomer.getAge());

	
	return customerRepository.save(customerToUpdate);
	}
}

	
