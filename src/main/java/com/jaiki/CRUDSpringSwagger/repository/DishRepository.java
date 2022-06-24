package com.jaiki.CRUDSpringSwagger.repository;

import org.springframework.data.repository.CrudRepository;

import com.jaiki.CRUDSpringSwagger.model.Dish;

public interface DishRepository extends CrudRepository<Dish, Integer> {

}
