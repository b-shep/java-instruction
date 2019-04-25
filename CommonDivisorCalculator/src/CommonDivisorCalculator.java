import java.util.Scanner;

public class CommonDivisorCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Common Divisor Calculator!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter First Number: ");
			int first = sc.nextInt();
			System.out.print(" Enter Second Number: ");
			int second = sc.nextInt();
			
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
		

}
