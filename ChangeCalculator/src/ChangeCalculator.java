import java.util.Scanner;



public class ChangeCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome to Change Calculator");
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			int quarters;
			int dimes;
			int nickels;
			int pennies;
			
			System.out.print("Enter Cents: ");
			
			int cents = sc.nextInt();
			quarters = cents / 25;
			int dimeCents = cents % 25;
			dimes = dimeCents /10;
			int nickelCents = dimeCents % 10;
			nickels = nickelCents / 5;
			int pennyCents = nickelCents % 5;
			pennies = pennyCents;
			
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes   : " + dimes);
			System.out.println("Nickels : " + nickels);
			System.out.println("Pennies : " + pennies);

			System.out.print("Continue? (y/n) ");
			cont = sc.next();
			}
		
	}
}
