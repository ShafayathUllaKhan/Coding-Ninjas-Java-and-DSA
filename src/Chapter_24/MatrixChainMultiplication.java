package Chapter_24;

import java.util.ArrayList;

public class MatrixChainMultiplication {

	static ArrayList<ArrayList<Integer>> dp;
	
	//Memoization
	private static int helper(int[] arr, int i, int j) {
		//Base
		if(i==j) return 0;
		
		if(dp.get(i).get(j) != -1) return dp.get(i).get(j);
		//Choices
		int mini = Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
			int temp = helper(arr,i,k) + helper(arr,k+1, j) + arr[i-1] * arr[k] * arr[j];
			mini = Math.min(mini, temp);
		}
		
		//Optimal
		dp.get(i).set(j, mini);
		return mini;
	}
	
	//Tabulation
	private static int helperTab(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			dp.get(i).set(i, 0);
		}
		
		for(int i=n-1;i>=1;i--) {
			for(int j=i+1;j<n;j++) {
				int mini = Integer.MAX_VALUE;
				for(int k=i;k<j;k++) {
					int temp = dp.get(i).get(k) + dp.get(k+1).get(j) + arr[i-1] * arr[k] * arr[j];
					mini = Math.min(mini, temp);
				}
				dp.get(i).set(j, mini);
			}
		}
		return dp.get(1).get(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 15, 20, 25};
		int n = arr.length;
		
		dp = new ArrayList<>(n + 1);
		for(int i=0;i<=n; i++) {
			ArrayList<Integer> row = new ArrayList<>(n + 1);
			for(int j=0; j<=n;j++) {
				row.add(-1); 
			}
			dp.add(row);
		}

	//	int ans = helper(arr, 1, n-1);
		int ans = helperTab(arr, n);
		System.out.println("Minimum no. of operations: " + ans);
	}

}
