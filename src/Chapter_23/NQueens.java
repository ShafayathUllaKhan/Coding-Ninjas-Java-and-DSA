package Chapter_23;

public class NQueens {
	
	public static void placeNQueens(int n) {
		int board[][] = new int[n][n];
		placeQueens(board, n, 0);
	}
	
	private static void placeQueens(int[][] board, int n, int row) {
		if(row == n) {
			//Print valid board configuration
			printBoard(board, n);
			System.out.println();
			return;
		}
		
		// check for all columns
		for(int j=0;j < n;j++) {
			 // check if its safe to place Queen
			if(isBoardSafe(board, n, row, j)) {
				// if its safe -> then place the queen and move to next row
				board[row][j] = 1;
				placeQueens(board, n, row + 1);
				board[row][j] = 0;
			}
		}
		  
		       
		
	}
	
	private static boolean isBoardSafe(int[][] board, int n, int row, int col) {
		// vertical direction
		for(int i = row - 1; i >= 0; i--) {
			if(board[i][col] == 1) return false;
		}
		
		for(int i = row - 1, j = col - 1;i >= 0 && j >= 0; i--, j--) {
			if(board[i][j] == 1) return false;
		}
		
		for(int i = row - 1, j = col + 1;i >= 0 && j < n; i--, j++) {
			if(board[i][j] == 1) return false;
		}
		
		return true;
	}

	private static void printBoard(int[][] board, int n) {
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		placeNQueens(4);
	}

}
