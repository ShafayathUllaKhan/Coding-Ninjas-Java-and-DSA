package Chapter_24;

import java.util.ArrayList;

public class MaxPathSum {
	static ArrayList<ArrayList<Integer>> dp;
	
	//Mezoization
	private static int helper(int[][] grid, int n,int m,int x,int y) {
		//Base
		if(x == n) return 0;
		if(x< 0 || x>=n || y<0 || y >=m) return Integer.MAX_VALUE;
		
		if(dp.get(x).get(y) != -1) return dp.get(x).get(y);
		//Choice
		int op1,op2,op3;
		op1 = grid[x][y] + helper(grid, n, m, x+1, y);
		op2 = grid[x][y] + helper(grid, n, m, x+1, y - 1);
		op3 = grid[x][y] + helper(grid, n, m, x+1, y + 1);
		
		//Optimal
		int temp = Math.max(op1, Math.max(op2, op3));
		dp.get(x).set(y, temp);
		return temp;
	}
	
	//Tabulation
	private static int helperTab(int[][] grid,int n,int m) {
		for(int i=0;i<m;i++) {
			dp.get(0).set(i, grid[0][i]);
		}
			for(int i=1;i<n;i++) {
				for(int j=0;j<m;j++) {
					int op1, op2 = Integer.MIN_VALUE, op3 = Integer.MIN_VALUE;
					
					op1 = grid[i][j] + dp.get(i - 1).get(j);
					if(j != 0)
					 op2 = grid[i][j] + dp.get(i-1).get(j-1);
					if(j != m - 1)
					 op3 = grid[i][j] + dp.get(i -1).get(j+1);
					
					int temp = Math.max(op1, Math.max(op2, op3));
					dp.get(i).set(j, temp);
				}
			}
			int ans = Integer.MIN_VALUE;
			for(int i = 0;i<m;i++) {
				ans = Math.max(ans, dp.get(n-1).get(i));
			}
			return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
		
		int n=4, m = 4;
		
		dp = new ArrayList<>(n);
		for(int i=0;i<n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j=0; j<m;j++) {
				row.add(-1); //memozition
			}
			dp.add(row);
		}
		
		int ans = Integer.MIN_VALUE;
		//Function call
//		for(int i=0;i<m;i++) {
//			ans = Math.max(ans, helper(grid, n, m, 0,i));
//		}
		
		ans = helperTab(grid,n,m);
	
		System.out.println("Max. path sum: " + ans);
	}

}
