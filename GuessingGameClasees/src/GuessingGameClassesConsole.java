	import java.util.Scanner;

	public class GuessingGameClassesConsole {
	    
	    private static Scanner sc = new Scanner(System.in);


		
	    
	    public static int getUserGuess(String prompt) {
	    	int guess = 0;
	    	boolean isValid = false;
	    	
	    	while(!isValid) {
	    		System.out.println(prompt);
	    		if (sc.hasNextInt()) {
	    			guess = sc.nextInt();
	    			isValid = true;
	    		} else {
	    			System.out.println("Please enter valid integer");
	    		}
	    	}
	    	sc.nextLine();
	    	return guess;
		}
	    
	    public static int getUserGuess(String prompt, int min, int  max) {
	    	int guess = 0;
	    	boolean isValid = false;
	    	
	    	while (!isValid) {
	    		guess = getUserGuess(prompt);
	    		if (guess < 1 ) {
	    			System.out.println("Too low, enter a number between 1 and 100");
	    		} else if (guess > 100) {
	    			System.out.println("Too high, enter a number between 1 and 100");
	    		} else {
	    			isValid = true;
	    		}
	    	}
	    	sc.nextLine();
	    	return guess;
	    }
	    
	    
	    public static String getString(String prompt) {
	        System.out.print(prompt);
	        String s = sc.next();  // read user entry
	        sc.nextLine();  // discard any other data entered on the line
	        return s;
	    }
	    
	    public static String getString(String prompt, String y, String n) {
	        String s = "";
	        boolean isValid = false;
	        
	        while(!isValid) {
	        	s = getString(prompt);
	        	if (s.equalsIgnoreCase(y) || s.equalsIgnoreCase(n)) {
		        	isValid = true;
	        	} else if (s.equalsIgnoreCase("")) {
	        		System.out.println("Entry Required.");
	        	} else {
	        		System.out.println("Please Enter 'y' or 'n'");
	        	}
	        }
	        sc.nextLine();
	        return s;
	    
	    }
}