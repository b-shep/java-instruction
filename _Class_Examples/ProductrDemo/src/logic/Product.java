package logic;

import db.ProductReader;

public class Product implements ProductReader{
	
//	instance variables
	private String code;
	private String description;
	private double price;
	
//	constructors
	public Product() {
		code = "";
		description = "";
		price = 0.0;
	}

	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}

	
//	generated get/set
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
	

	
//	I wrote these get/set methods
//	public String getCode() {
//		return code;
//	}
//	
//	public void setCode(String codeSet) {
//		code = codeSet;
//	}
//	
	
	@Override //overrides the method of the parent class
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	
	
	public static void aStaticMethod() {
		System.out.println("an arbitrary static method");  
	}

	@Override
	public Product get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
