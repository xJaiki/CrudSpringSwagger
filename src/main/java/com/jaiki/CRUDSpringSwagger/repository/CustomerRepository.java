package com.jaiki.CRUDSpringSwagger.repository;

import org.springframework.data.repository.CrudRepository;

import com.jaiki.CRUDSpringSwagger.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
