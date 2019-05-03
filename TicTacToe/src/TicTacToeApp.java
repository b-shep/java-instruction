
public class TicTacToeApp {

	public static void main(String[] args) {
		Board board = new Board(new String [3][3]);
		
		
		String player1 = "X";
		String player2 = "O";
		String currentPlayer = "O";
		board.resetBoard();
		board.displayBoard();
		
		
		String game = "y";
		
		while (game.equalsIgnoreCase("y")) {
			if (currentPlayer.equals("O")) {
				currentPlayer = "X";
			} else if (currentPlayer.equals("X")){
				currentPlayer = "O";
			}
			System.out.println(currentPlayer + "'s move!");
			selectMove(board, currentPlayer);
			board.displayBoard();
			String gameOver = board.checkWinner(currentPlayer);
			if (gameOver.equals("y")){
				board.resetBoard();
				game = Console.getString("Play Again? (y/n)", "y", "n");
			}
				
		}
	}	
		  
	
	public static void selectMove(Board board, String currentPlayer) {
		
		String moveCheck = "checking...";
		while(moveCheck.equals("checking...")) {
			int moveRow = Console.getInt("Pick a row: ", 1, 3);
			int moveColumn = Console.getInt("Pick a column: ", 1, 3);
			moveCheck = board.checkMove(currentPlayer, moveRow, moveColumn);
		}
	
	}
}
	

	
	


