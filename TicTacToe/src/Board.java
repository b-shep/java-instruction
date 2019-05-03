
public class Board {
	String[][] board;
	
	public Board(String[][] board) {
		super();
		this.board = board;
	}

	
	//print out of current board
	public void displayBoard() {
		System.out.println("+---+---+---+");
		for (int column = 0; column < 3; column++) {
			for (int row = 0; row < 3; row++) {
				if(board[row][column].equals("")){
					System.out.print("|   ");
				} else if (board[row][column].equals("X")) {
					System.out.print("| X ");
				} else if (board[row][column].equals("O")) {
					System.out.print("| O ");
				}
			}
			System.out.print("|");
			System.out.println("\r\n+---+---+---+");
		}
	}
	
//check user move
	public String checkMove(String currentPlayer, int column, int row) {
	
		if (!board[row-1][column-1].equals("")) {
			System.out.println("Error! Square already chosen.");
			return "checking...";
		} else {
			board[row-1][column-1] = currentPlayer;
			return "good move!";
		}
	}
	
	
	
	
	
	//check for winners
	public String checkWinner(String player) {
		if(checkRow(player) ||
		checkColumn(player) ||
		checkSlash(player)){
			return "y";
			
		} else {
			return "n";
		}
		
		
	}
	
	//check row for winner
	public boolean checkRow(String player) {
		for (int row = 0; row < 3; row++) {
			int sum = 0;
			for (int column = 0; column < 3; column++) {
				if (board[row][column].equals(player)) {
					sum++;
				}
			}
			if(sum == 3) {
				System.out.println(player + " Wins!!!");
				return true;
				
			}
		}
		return false;
	}
	public boolean checkColumn(String player) {
		int[] columnSum = {0,0,0};
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				if (board[row][column].equals(player)){
					columnSum[column]++;
				}
			}
		}
		//check columnSum for winner based on column
		for (int i = 0; i <3; i++) {
			if (columnSum[i] == 3) {
				System.out.println(player + " Wins!!!");
				return true;
			}
		}
		return false;
	}
	
	public boolean checkSlash(String player) {
		int backSlashSum = 0;
		int forwardSlashSum = 0;
		if (board[0][0].equals(player)){
			backSlashSum++;
		}
		if (board[2][2].equals(player)){
			backSlashSum++;
		}
		if (board[2][2].equals(player)){
			backSlashSum++;
			forwardSlashSum++;
		}
		if (board[0][2].equals(player)){
			forwardSlashSum++;
		}
		if (board[2][0].equals(player)){
			forwardSlashSum++;
		}
		if (backSlashSum == 3 || forwardSlashSum == 3) {
			return true;
		}else {
			return false;
		}

	}
	public String[][] resetBoard() {
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				board[row][column] = "";
			}
		}
		return board;
	}	
}
