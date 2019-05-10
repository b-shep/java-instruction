package ui;
import logic.Board;
import util.Console;

public class TicTacToeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe.");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int size = Console.getInt("Enter Board Size: ", 3, 10);
			System.out.println();
			String[][] boardArray = new String[size][size];
			Board board = new Board(boardArray);
			board.resetBoard();
			board.displayBoard();
			
			String currentPlayer = "O";
			
			String playing = "y";
			while(playing.equals("y")) {
				if (currentPlayer.equals("O")) {
					currentPlayer = "X";
				} else if (currentPlayer.equals("X")){
					currentPlayer = "O";
				}
				System.out.println(currentPlayer + "'s move!");
				selectMove(board, currentPlayer);
				board.displayBoard();
			
				if (board.checkWinner(currentPlayer)){
					System.out.println(currentPlayer + " wins!!!");
					board.resetBoard();
					playing = "n";
				}
				if(board.checkTie()) {
					System.out.println("tie game.");
					board.resetBoard();
					playing = "n";
				}
				
			}
			choice = Console.getString("Play Again? (y/n)", "y", "n");
		}
		System.out.println("\n\nBye.");
	}	
		  
	
	public static void selectMove(Board board, String currentPlayer) {
		
		boolean move = false;
		while(!move) {
			int moveRow = Console.getInt("Pick a row: ", 1, board.getSize());
			int moveColumn = Console.getInt("Pick a column: ", 1, board.getSize());
			
			if(board.checkMove(currentPlayer, moveRow, moveColumn)) {
				move = true;
			} else{
				System.out.println("Error! Square already chosen.");
			}
		}
	
	}
}
	

	
	


