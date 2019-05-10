package ui;

import java.util.List;

import db.DAO;
import db.User_DB;
import util.Console;
import util.StringUtils;



public class PRSapp {



private static DAO<Stuffy> stuffyDAO = new StuffyDB();
	
public static void main(String[] args) {
		System.out.println("Welcome to Product Manager");
		
		displayMenu();
		String action = "";
		while (!action.equals("exit")) {
			action = Console.getString("Enter a command: ");
			if(action.equalsIgnoreCase("list")){
				displayAllStuffies();
				
			} else if(action.equalsIgnoreCase("add")){
				addStuffy();
				
			} else if(action.equalsIgnoreCase("del")){
				deleteStuffy();
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
				+ "list 		-list all stuffies\n"
				+ "add		-add a product\n"
				+ "del		-delete a product\n"
				+ "help		-show this menu\n"
				+ "exit		-exit the app\n");
	}
	
	private static void displayAll() {
		System.out.println("OBJECT LIST");
		System.out.println("=====================");
		List<> stuffies = stuffyDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (Stuffy s: stuffies) {
			sb.append(StringUtils.padWithSpaces(Integer.toString(s.getId()), 10));
			sb.append(StringUtils.padWithSpaces(s.getType(), 10));
			sb.append(StringUtils.padWithSpaces(s.getColor(), 10));
			sb.append(StringUtils.padWithSpaces(s.getSize(), 10));
			sb.append(s.getLimbs());
			sb.append("\n");
	
		}
		System.out.println(sb.toString());
	}
	
	
	private static void addStuffy() {
		String type = Console.getString("Enter Type: ");
		String color = Console.getString("Enter Color: ");
		String size = Console.getString("Enter Size: ", "X-Small", "Small", "Medium", "Large", "X-Large");
		int limbs = Console.getInt("Enter Limbs: ");
		
		Stuffy s = new Stuffy(type, color, size, limbs);
		
		if(stuffyDAO.add(s)) {
			System.out.println("Product " + s.getType() + " successfully added");
			
		} else {
			System.out.println("Error! " + s.getType() + " not added!");
		}
		
	}
	
	private static void deleteStuffy() {
		System.out.println("!!! Delete Stuffy !!!");
		String id = Console.getString("Enter ID of Stuffy to Delete: ");
		
		Stuffy s = stuffyDAO.get(id);
		if (s == null) {
			System.out.println("Invalid ID!");
		} else {
			if (stuffyDAO.delete(s)) {
				System.out.println("Delete Succes!");
			} else {
				System.out.println("Error deleting product!");
					}
				}
				
			}

}


