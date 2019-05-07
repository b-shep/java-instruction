package app;

import classes.IOFactory;
import interfaces.UserIO;

public class UserIOTestApp {

	public static void main(String[] args) {
		UserIO newIO = IOFactory.getUserIO();
		
		newIO.println("Int Test");
		newIO.getInt("Enter Integer Between -100 and 100: ", -100, 100);
		newIO.println();
		newIO.println("Double Test");
		newIO.getDouble("Enter Double Between -100 and 100: ", -100, 100);
		newIO.println();
		newIO.println("Required String Test");
		newIO.getString("Enter your email: ");
		newIO.getString("Select one (x/y): ");
	}

}
