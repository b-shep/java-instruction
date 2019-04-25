import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Factorial Calculator!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter number less than 21: ");
			int userInput = sc.nextInt();
			if (userInput > 21 || userInput < 1) {
				System.out.println("Please Enter Valid Number!");
				continue;
			} else {
				long total = 1;
				for (int i = 1; i <= userInput; i++) {
					total = total * i;
				}
				System.out.println("The Factorial of " + userInput + " is " + total);

			}
			
			System.out.print("Continue(y/n)?");
			choice = sc.next();
		}
	}

}
