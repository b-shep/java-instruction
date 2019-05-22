package com.mma.logic;

import javax.persistence.*;

@Entity
public class Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String description;
	private double price;
	
	public Product() {
	}

	// we wrote this one in class
	public Product(String inCode, String inDesc, double inPrice) {
		code = inCode;
		description = inDesc;
		price = inPrice;
	}	

	
	
	public Product(int id, String code, String description, double price) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
}
