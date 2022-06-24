package com.jaiki.CRUDSpringSwagger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dish {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int price;
	
	@ManyToOne
	@JoinColumn(name="fk_customer")
	private Customer customer;
	
	public Dish() {}
	
	public Dish(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
