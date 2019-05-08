package ui;
import java.util.ArrayList;

import logic.CountryListIO;
import util.Console;

public class CountryListManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Country List Manager");
		System.out.println("COMMAND MENU:\n1 - List Countries\n2 - Add a country\n3 - Exit");
		
		
		String cont = "yes";
		do {
			CountryListIO edit = new CountryListIO();
			String choice = Console.getString("Enter menu number: ", "1", "2", "3");
			if(choice.equals("1")) {
				ArrayList<String> list = edit.getCountries();
				for (String s: list) {
					System.out.println(s);
				}
			} else if(choice.equals("2")) {
				String newCountry = Console.getString("Enter Country: ");
				edit.add(newCountry);
				edit.saveCountries();
				
			} else if(choice.equals("3")) {
				cont = "no";
			}
			
		} while(cont.equals("yes"));
	}

}
