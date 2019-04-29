import java.util.Scanner;


public class DiceRollerClassesApp {

	public static void main(String[] args) {
		Dice dice = new Dice();
		String choice = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Dice Roller!");
		System.out.println("Roll the dice? (y/n)");
		choice = sc.next();
		
		while (choice.equalsIgnoreCase("y")) {
			dice.roll();
			dice.printRoll();
			System.out.println("Roll again? (y/n)");
			choice = sc.next();
		}

	}
}
