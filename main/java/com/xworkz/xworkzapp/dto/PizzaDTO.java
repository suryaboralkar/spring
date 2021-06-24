package com.xworkz.xworkzapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "pizza_details")
public class PizzaDTO {
	@Column(name = "PIZZA_ID")
	@Id // this annotation is used for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this annotaation is used for auto incriment
	private int pizzaID;
	@Column(name = "NAME")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "PRICE")
	private double price;

	@Column(name = " IS_AVAILABLE")
	private boolean isAvailable;

	@Column(name = "SIZE")
	private String size;
	@Column(name = "TYPE")
	private String type;
	
	
	public PizzaDTO() {
		super();
	}


	public PizzaDTO(String name, String location, double price, boolean isAvailable, String size, String type) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.isAvailable = isAvailable;
		this.size = size;
		this.type = type;
	}
	


	public int getPizzaID() {
		return pizzaID;
	}


	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}


	public double getPrice() {
		return price;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public String getSize() {
		return size;
	}


	public String getType() {
		return type;
	}


	public void setPizzaID(int pizzaID) {
		this.pizzaID = pizzaID;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "PizzaDTO [pizzaID=" + pizzaID + ", name=" + name + ", location=" + location + ", price=" + price
				+ ", isAvailable=" + isAvailable + ", size=" + size + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
