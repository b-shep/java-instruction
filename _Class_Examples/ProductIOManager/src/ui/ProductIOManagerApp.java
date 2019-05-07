package ui;



import java.util.List;

import business.Product;
import db.DAO;
import db.ProductTextFile;
import util.Console;
import util.StringUtils;

public class ProductIOManagerApp {
	
	
	private static DAO<Product> productDAO = new ProductTextFile();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Product Manager: Text Edition");
		
		displayMenu();
		String action = "";
		while (!action.equals("exit")) {
			action = Console.getString("Enter a command: ");
			if(action.equalsIgnoreCase("list")){
				displayAllProducts();
				
			} else if(action.equalsIgnoreCase("add")){
				addProduct();
				
			} else if(action.equalsIgnoreCase("del")){
				deleteProduct();
			} else if(action.equalsIgnoreCase("help")){
				displayMenu();
			} else {
				System.out.println("Invalid Command");
			}
				
				
		}
		
		
		
		System.out.println("Bye.");
	}

	public static void displayMenu() {
		System.out.println("COMMAND MENU\n"
				+"=====================\n"
				+ "list 		-list all products\n"
				+ "add		-add a product\n"
				+ "del		-delete a product\n"
				+ "help		-show this menu\n"
				+ "exit		-exit the app\n");
	}
	
	private static void displayAllProducts() {
		System.out.println("PRODUCT LIST");
		System.out.println("=====================");
		List<Product> products = productDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (Product p: products) {
			sb.append(StringUtils.padWithSpaces(p.getCode(), 8));
			sb.append(StringUtils.padWithSpaces(p.getDescription(), 40));
			sb.append(p.getPrice());
			sb.append("\n");

		}
		System.out.println(sb.toString());
	}
	
	private static void addProduct() {
		String code = Console.getString("Enter Product Code: ");
		String description = Console.getString("Enter Product Description: ");
		Double price = Console.getDouble("Enter Product Price: ");
		
		Product p = new Product(code, description, price);
		
		if(productDAO.add(p)) {
			System.out.println("Product " + p.getCode() + " successfully added");
			
		} else {
			System.out.println("Error! " + p.getCode() + " not added!");
		}
		
	}
	
	private static void deleteProduct() {
		System.out.println("!!! Delete Product !!!");
		String code = Console.getString("Enter Product Code to Delete: ");
		
		Product p = productDAO.get(code);
		if (p == null) {
			System.out.println("Invalid Code.");
		} else {
			if (productDAO.delete(p)) {
				System.out.println("Delete Succes!");
			} else {
				System.out.println("Error deleting product!");
			}
		}
		
	}
	
	
}
