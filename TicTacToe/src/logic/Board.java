package logic;


public class Board {
	String[][] board;
	int size;
	
	public Board(String[][] board) {
		this.board = board;
		size = board.length;
	}

	
//print out of current board
	public void displayBoard() {
		for (int column = 0; column < size; column++) {
			for (int row = 0; row < size; row++) {
				System.out.print("+---");
			}
			System.out.println("+");
			for (int row = 0; row < size; row++) {
				if(board[row][column].equals("")){
					System.out.print("|   ");
				} else if (board[row][column].equals("X")) {
					System.out.print("| X ");
				} else if (board[row][column].equals("O")) {
					System.out.print("| O ");
				}
			}
			System.out.println("|");
			
		}

		for (int row = 0; row < size; row++) {
			System.out.print("+---");
		}
		System.out.println("+");
	}
	
//check user move
	public boolean checkMove(String currentPlayer, int column, int row) {
	
		if (!board[row-1][column-1].equals("")) {
			return false;
		} else {
			board[row-1][column-1] = currentPlayer;
			return true;
		}
	}
	
	
	
	public boolean checkTie() {
		int counter = 0;
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				if (!board[row][column].equals("")) {
					counter++;
				}
			}
		}
		if (counter == size * size) {
			return true;
		}
		return false;
	}
	
	//check for winners
	public boolean checkWinner(String player) {
		if(checkRow(player) ||
		checkColumn(player) ||
		checkDiagonal(player)){
			return true;
			
		} else {
			return false;
		}
		
		
	}
	
	//check row for winner
	public boolean checkRow(String player) {
		for (int row = 0; row < size; row++) {
			int sum = 0;
			for (int column = 0; column < size; column++) {
				if (board[row][column].equals(player)) {
					sum++;
				}
			}
			if(sum == size) {
				return true;
				
			}
		}
		return false;
	}
	public boolean checkColumn(String player) {
		int[] columnSum = new int[size];
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				if (board[row][column].equals(player)){
					columnSum[column]++;
				}
			}
		}
		//check columnSum for winner based on column
		for (int i = 0; i <size; i++) {
			if (columnSum[i] == size) {
				return true;
			}
		}
		return false;
	}

	
//	public boolean checkSlash(String player) {
//		int backSlashSum = 0;
//		int forwardSlashSum = 0;
//		if (board[0][0].equals(player)){
//			backSlashSum++;
//		}
//		if (board[2][2].equals(player)){
//			backSlashSum++;
//		}
//		if (board[2][2].equals(player)){
//			backSlashSum++;
//			forwardSlashSum++;
//		}
//		if (board[0][2].equals(player)){
//			forwardSlashSum++;
//		}
//		if (board[2][0].equals(player)){
//			forwardSlashSum++;
//		}
//		if (backSlashSum == 3 || forwardSlashSum == 3) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//
	
	
	
	
	public boolean checkDiagonal(String player) {
		int diagForward = 0;
		int diagBack = 0;
		for (int row = 0; row < size; row++) {
			for (int space = 0; space < size; space++) {
				if (row-space == 0 && board[row][space].equals(player)) {
					diagBack++;
				}
				if (row + space == size -1 && board[row][space].equals(player)) {
					diagForward++;
				}
			}
		}
		if (diagForward == size || diagBack == size) {
			return true;
		} else {
			return false;
		}
	}
	
	public String[][] resetBoard() {
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				board[row][column] = "";
			}
		}
		return board;
	}


	public int getSize() {
		return size;
	}	
}
