package com.perscholas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stores {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int store_id;
	@Column(nullable=false)
	String name;
	@Column(nullable=false)
	String city;
	@Column(nullable=false)
	String state;
	
	public Stores(String name, String city, String state) {
		this.name =name;
		this.city = city;
		this.state = state;
	}
	public Stores() {
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
