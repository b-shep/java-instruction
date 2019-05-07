import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guessing Game!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number from 1 to 100.\nTry to guess it.");
			int solution = getRandom();
			int counter = 0;
			int guess = getGuess(sc, "Enter Guess:");
			
			while (solution != guess) {
				if (guess < solution) {
					if (solution - guess > 10) {
						System.out.println("Way Too Low!");
					} else {
						System.out.println("Too low!");
					}
					counter++;
					guess = getGuess(sc, "Guess again:");
				} if (guess > solution) {
					if (guess - solution > 10) {
						System.out.println("Way Too High!");
					} else {
						System.out.println("Too high!");
					}
					counter++;
					guess = getGuess(sc, "Guess again: ");
				}
			}
			
			//check how many tries
			System.out.println("You got it in " + counter + " tries.");
			if (counter <= 3) {
				System.out.println("Great work! You are a mathematical wizard.");
			} else if (counter > 3 && counter <= 7) {
				System.out.println("Not too bad! You've got some potential.");
			} else {
				System.out.println("What took you so long? Maybe you should take\r\n" + 
						"some lessons.");
			}
			
			System.out.print("Play again? (y/n)  ");
			choice = sc.next();
			
		}
		System.out.println("Bye!");
	}

//get random number
	public static int getRandom() {
		double random = 1 + Math.random() *100;
		return (int) random;
	}
	
	
//validate user input
	public static int getGuess(Scanner sc, String prompt) {
		System.out.println(prompt);
		int input = 0;
		boolean isValid = false;

		while(!isValid){
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if (input < 1 || input >100) {
					System.out.println("Please enter Integer Between 1 and 100");
					input = 0;
				}
				isValid = true;
			} else {
				System.out.println("Please enter Integer Between 1 and 100");
			}
			sc.nextLine();
		}
		return input;
	}
}
