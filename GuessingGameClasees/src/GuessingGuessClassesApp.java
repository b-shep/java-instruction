
public class GuessingGuessClassesApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guessing Game!");
		Game playGame = new Game();
		String choice = "y";
		
		
		while (choice.equalsIgnoreCase("y")) {
			int compGuess = getRandom();
			playGame.setCompGuess(compGuess);

			
			boolean isValid = false;	
			while (!isValid) {
				int userGuess = GuessingGameClassesConsole.getUserGuess("Enter Guess: ", 1, 100);
				System.out.println(userGuess);
				playGame.setUserGuess(userGuess);
				playGame.setIsNum(userGuess, compGuess);
				isValid = playGame.getIsNum();
			}
			int guesses = Game.getNumberOfGuesses();
			playGame.getProwess(guesses);
			playGame.reset();
			choice = GuessingGameClassesConsole.getString("Continue? (y/n)", "y", "n");
		}

	}
	
	public static int getRandom() {
		double random = 1 + Math.random() *100;
		return (int) random;
	}
}

