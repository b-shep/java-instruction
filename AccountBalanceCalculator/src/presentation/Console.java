package presentation;
import java.util.Scanner;

import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }
    
    public static String getString(String prompt, String c, String sq) {
        String s = "";
        boolean isValid = false;
        
        while(!isValid) {
        	s = getString(prompt);
        	if (s.equalsIgnoreCase(c) || s.equalsIgnoreCase(sq)) {
	        	isValid = true;
        	} else if (s.equalsIgnoreCase("")) {
        		System.out.println("Entry Required.");
        	} else {
        		System.out.println("Error! Must enter '" + c + "' or '" + sq + ". Try again. ");
        	}
        }
        return s;
    
    }

    public static int getInt(String prompt) {
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

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
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
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }

    public static void displayResults(SavingsAccount savings, CheckingAccount checking) {
    	System.out.println("");
    	System.out.println("Monthly Payments and Fees:");
    	System.out.println("Checking Fee: " + checking.getMonthlyFee());
    	System.out.println("Savings Interest Payment: " + savings.getPayOut() + "\n");
    	System.out.println("");
    	System.out.println("Final Balances:");
    	System.out.println("Checking: " + checking.getBalance());
    	System.out.println("Savings:  " + savings.getBalance());
    }
}