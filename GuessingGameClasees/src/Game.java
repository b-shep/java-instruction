
public class Game {
	private int userGuess;
	private int compNum;
	private static int numberOfGuesses;
	private boolean isNum;

	public Game() {
		userGuess = 0;
		compNum = 0;
		numberOfGuesses = 0;
		isNum = false;
	}

	public void setUserGuess(int userGuess) {
		this.userGuess = userGuess;
		numberOfGuesses++;

	} 

	public void setCompGuess(int compNum) {
		this.compNum = compNum;
	}

	public static int getNumberOfGuesses() {
		return numberOfGuesses;
	}

	public void setIsNum(int userGuess, int compNum) {
		if (userGuess < compNum) {
			if (compNum - userGuess > 10) {
				System.out.println("Way Too Low!");
			} else {
				System.out.println("Too low!");
				}
		} else if (userGuess > compNum) {
			if (userGuess - compNum > 10) {
				System.out.println("Way Too High!");
			} else {
				System.out.println("Too high!");
				}
		} else {
			isNum = true;
		}
	
	}
	public boolean getIsNum() {
		return isNum;
	}
	
    public void getProwess(int counter) {
    	System.out.println("You got it in " + counter + " tries.");
    	if (counter <= 3) {
			System.out.println("Great work! You are a mathematical wizard.");
		} else if (counter > 3 && counter <= 7) {
			System.out.println("Not too bad! You've got some potential.");
		} else {
			System.out.println("What took you so long? Maybe you should take\r\n" + 
					"some lessons.");
		}
    	
    }
    public void reset () {
		numberOfGuesses = 0;
		isNum = false;
    }
    
}


