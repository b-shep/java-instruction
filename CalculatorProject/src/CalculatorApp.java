import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to CalculatorApp" + "\r");
		int n = 0;
		while (n == 0) {
			
			Scanner sc = new Scanner(System.in); 
			System.out.print("Enter First Number: ");
			double num1 = sc.nextInt();
			System.out.print("Enter Second Number: ");
			double num2 = sc.nextInt();
			
			double sum = num1 + num2;
			double diff = num1 - num2;
			double product = num1 * num2;
			double quotient = num1 / num2;
			
			System.out.println("Sum is:        " + sum);
			System.out.println("Difference is: " + diff);
			System.out.println("Product is:    " + product);
			System.out.println("Quotient is:   " + quotient + "\n");
			System.out.println("Continue? (y/n?)");
			String cont = sc.next();
			if (cont.equals("n")) {
				n+=1;
			}

		}
		System.out.println("L8r");
	}
}