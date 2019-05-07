package classes;

import interfaces.UserIO;

public class IOFactory{
	
	public static UserIO getUserIO() {
		UserIO newIO = new ConsoleIO();
		return newIO;
	}
	
	
}
