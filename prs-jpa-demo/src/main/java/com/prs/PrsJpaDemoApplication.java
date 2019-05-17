package com.prs;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.db.ProductDB;
import com.prs.db.UserDB;
import com.prs.db.VendorDB;
import com.prs.logic.POJO_values;
import com.prs.logic.User;
import com.prs.logic.Vendor;
import com.prs.util.Console;;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		
		System.out.println("Hello");
		VendorDB v = new VendorDB();
		UserDB u = new UserDB();
		
		
		
		displayUsers(u);
		
//		displayMenu();
//		String action = "";
//		while (!action.equals("exit")) {
//			action = Console.getString("Enter a command: ");
//			if(action.equalsIgnoreCase("list")){
//				displayTable();
//				String table = Console.getString("Enter a table: ");
//					if(table.equalsIgnoreCase("user")){
//						UserDB.getAll();
//						
//					} else if(table.equalsIgnoreCase("vendor")){
//						VendorDB.getAll();
//						
//					} else if(table.equalsIgnoreCase("product")){
//					//	ProductDB.getAll();
//					} else if(table.equalsIgnoreCase("help")){
//						displayMenu();
//					} else {
//						System.out.println("Invalid Command");
//					}
//				
//				
//			} else if(action.equalsIgnoreCase("add")){
//				
//				
//			} else if(action.equalsIgnoreCase("del")){
//				
//			} else if(action.equalsIgnoreCase("help")){
//				displayMenu();
//			} else {
//				System.out.println("Invalid Command");
//			}
//		}
		

	}
	
	public static void displayTable() {
		System.out.println("AVAILABLE TABLES\n"
				+"=====================\n"
				+ "user\n"
				+ "vendor\n"
				+ "product\n"
				+ "purchaseRequest\n"
				+ "purchaseRequestLineItem\n");
	}
	
	public static void displayMenu() {
		System.out.println("COMMAND MENU\n"
				+"=====================\n"
				+ "list 		-list all\n"
				+ "add		-add to table\n"
				+ "del		-delete from table\n"
				+ "help		-show this menu\n"
				+ "exit		-exit the app\n");
	}
	
	private static void displayAll(Consumer <POJO_values> values) {
	}
	
	private static void displayUsers(UserDB userDB) {
		List<User> users = userDB.getAll();
		for (User u: users) {
			System.out.println(u.toString());
		}
	}
	
	private static void delete() {
		System.out.println("!!! Delete !!!");
		int id = Console.getInt("Enter ID to Delete: ");
		
		User u = UserDB.get(id);
		if (u == null) {
			System.out.println("Invalid ID!");
		} else {
			if (UserDB.delete(u)) {
				System.out.println("Delete Succes!");
			} else {
				System.out.println("Error deleting product!");
					}
				}
				
			}
		
}
	
	


