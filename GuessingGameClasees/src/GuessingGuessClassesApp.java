
public class GuessingGuessClassesApp {

	public static void main(String[] args) {
		
		Game playGame = new Game();
		Game.welcomeMessage();
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int compGuess = playGame.getRandom(); 
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
}

