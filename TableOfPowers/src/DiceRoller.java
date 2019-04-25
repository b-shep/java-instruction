import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		System.out.println("Welcome to Dice Roller!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Roll Dice? (y/n)  ");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("y")) {
				int die1 = getRandDice();
				int die2 = getRandDice();
				
				System.out.println("Die 1: " + die1);
				System.out.println("Die 2: " + die2);
				if (die1 == 1 && die2 == 1) {
					System.out.println("Snake Eyes!");
				} else if (die1 == 6 && die2 == 6){
					System.out.println("Boxcar!");
				}
			} else {
				System.out.println("Bye!");
			}
			
			System.out.print("Continue(y/n)?  ");
			choice = sc.next();
		}
		System.out.println("Bye!");
	}
	
	public static int getRandDice() {
		 double x = 1 + Math.random() * 6;
		 return (int) x;
	}

}
