package Chapter_23;

public class WordSearch {
	
	public static boolean present(char[][] board, String word, int n, int m) {
		
		int[][] visited = new int[n][m];
		
		// for every cell in the board, look for first char of word\
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(board[i][j] == word.charAt(0)) {
					if(search(board, word, visited,1,i,j,n,m));
						return true;
				}
			}
		}
			return false;
		}
	
	static int  row[] = {0,0,-1, +1};
	static int  col[] = {+1, -1, 0, 0};
	
 	
	private static boolean search(char[][] board,String word, int[][] visited,int currIndex, int i,int j,int n,int m) {
		if(currIndex == word.length()) {
			return true;
		}
		
		visited[i][j] = 1;
		
		for(int move = 0; move < 4;move++) {
			int nextRow = i + row[move];
			int nextCol = j + col[move];
			
			if(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m && visited[nextRow][nextCol] == 0 
					&& board[nextRow][nextCol] == word.charAt(currIndex)) {
				if(search(board, word, visited, currIndex + 1, nextRow, nextCol, n, m)) {
					return true;
				}
			}
		}
		
		
//		// right - i, j +1
//		if(j + 1 < m && visited[i][j + 1] == 0 && board[i][j + 1] == word.charAt(currIndex)) {
//			if(search(board, word, visited, currIndex + 1, i, j + 1, n, m)) {
//				return true;
//			}
//		}
//		
//		// left - i, j - 1
//		if(j - 1 >= 0 && visited[i][j - 1] == 0 && board[i][j - 1] == word.charAt(currIndex)) {
//					if(search(board, word, visited, currIndex + 1, i, j - 1, n, m)) {
//						return true;
//					}
//				}
//		
//		// top - i - 1,j
//		if(i - 1 >= 0 && visited[i - 1][j] == 0 && board[i - 1][j] == word.charAt(currIndex)) {
//					if(search(board, word, visited, currIndex + 1, i - 1, j, n, m)) {
//						return true;
//					}
//				}
//		
//		// down - i + 1,j
//				if(i + 1 < n && visited[i + 1][j] == 0 && board[i + 1][j] == word.charAt(currIndex)) {
//							if(search(board, word, visited, currIndex + 1, i - 1, j, n, m)) {
//								return true;
//							}
//						}
				visited[i][j] = 0;
				return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char board[][] = {{'h','h','d','b','h'},{'d','e','l','w','o'},{'z','s','l','o','m'},{'j','i','g','n','k'}};
		String word = "glow";
		System.out.println(present(board, word, 4,5));
	}
}