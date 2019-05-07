import java.util.Scanner;

public class CommonDivisorCalculatorDataValidation {
	public static void main(String[] args) {
		System.out.println("Welcome to Common Divisor Calculator!");
		Scanner sc = new Scanner(System.in);
		
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int first = userEntry(sc, "Enter First Number: ");
			
			int second = userEntry(sc, "Enter Second Number: ");
			
			int switchHolder = first;
			first = second;
			second = switchHolder;
		
			
			while (first != 0 && second != 0) {
				switchHolder = first;
				first = second;
				second = switchHolder;
				while (first >= second) {
					first = first - second;
				}
			}
			if (second == 0) {
				System.out.println("The common divisor is: " + first);
			} else if (first == 0) {
				System.out.println("The common divisor is: " + second);
			} else {
				System.out.println("error!");
			}
			
			System.out.print("Continue(y/n)?");
			choice = sc.next();
			
		}
	}
	
	public static int userEntry(Scanner sc, String prompt) {
		int entry = 0;
		boolean isValid = false;
		
		while(!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				entry = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Please enter valid integer!");
			}
			sc.nextLine();
		}
		return entry;
		
	}
		
}
