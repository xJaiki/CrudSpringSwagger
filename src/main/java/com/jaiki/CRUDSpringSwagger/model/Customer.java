package com.jaiki.CRUDSpringSwagger.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	private @Id @GeneratedValue int id;
	private String name;
	private String lastname;
	private int age;

	@OneToMany(mappedBy="customer")
	private List<Dish> dish;

	public Customer() {
	}
	public Customer(int id, String name, String lastname, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getEta() {
		return age;
	}
	public void setEta(int age) {
		this.age = age;
	}

}