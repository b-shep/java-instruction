package classes;

import java.util.Scanner;

import interfaces.UserIO;

public class ConsoleIO implements UserIO{
	Scanner sc = new Scanner(System.in);

	

	@Override
	public int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
	}	

	@Override
	public int getInt(String prompt, int min, int max) {
		int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
	}

	@Override
	public double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;	}

	@Override
	public double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d < min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d > max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
	}

	@Override
	public String getString(String prompt) {
		String s = "";
		boolean isValid = false;

        while (!isValid) {
        	System.out.println(prompt);
        	s = sc.nextLine();
        	if (s.isEmpty()) {
        		System.out.println("Error! Entry Required!");
        	} else {
        		isValid = true;
        	}
        }
        return s;
	}

	@Override
	public String getString(String prompt, String s1, String s2) {
        String s = "";
        boolean isValid = false;
        
        while(!isValid) {
        	s = getString(prompt);
        	if (s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2)) {
	        	isValid = true;
        	} else if (s.equalsIgnoreCase("")) {
        		System.out.println("Entry Required.");
        	} else {
        		System.out.println("Error! Must enter '" + s1 + "' or '" + s2 + ". Try again. ");
        	}
        }
        return s;
	}

	@Override
	public void print(String s) {
		System.out.print(s);
	}

	@Override
	public void println() {
		System.out.println();
		
	}

	@Override
	public void println(String s) {
		System.out.println(s);
	}
	
	

}
