package com.jaiki.CRUDSpringSwagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DishController {

	@Autowired
	DishRepository dishRepository;
	
	public DishController(DishRepository dishRepository) {
		super();
		this.dishRepository = dishRepository;
	}


	@GetMapping("/dish")
	Iterable <Dish> getDish(){
		return dishRepository.findAll();
	}
	
	@GetMapping("/dish/{id}")
	Dish getDish(@PathVariable int id) {
		return dishRepository.findById(id).orElseThrow(null);		
	}
	
	@PostMapping("/dish")
	Dish insertDish(@RequestBody Dish newDish) {
		return dishRepository.save(newDish);
	}
	
	@DeleteMapping("/dish/{id}")
	String deleteDish(@PathVariable int id) {	
		dishRepository.deleteById(id);
	return "ID number : "+id+" deleted!";
	}
	
	@PutMapping("/dish/{id}")
	Dish updateDish(@PathVariable int id,@RequestBody Dish newDish ) {
	Dish dishToUpdate = dishRepository.findById(id).orElseThrow(null);
	dishToUpdate.setName(newDish.getName());
	dishToUpdate.setPrice(newDish.getPrice());

	
	return dishRepository.save(dishToUpdate);
	}
}
	
	
	
	
	
	
	
}
