package Chapter_24;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {

	static ArrayList<ArrayList<Integer>> dp;
	
	private static int helper(int arr[], int n,int idx, int prev_idx) {
		
		//Base
		if(idx == n) return 0;
		
		if(dp.get(idx).get(prev_idx + 1) != -1) return dp.get(idx).get(prev_idx + 1);
		//Choices
		int take = Integer.MIN_VALUE, notTake;
		notTake = helper(arr, n, idx+1, prev_idx);
		
		if(prev_idx == -1 || arr[idx] > arr[prev_idx])
			take = helper(arr, n, idx+1, idx) +1;
		
		//Optimal
		int temp = Math.max(take, notTake);
		dp.get(idx).set(prev_idx + 1, temp);
		return temp;
		
	}
	
	private static int helperTab(int arr[], int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0; j<=n;j++) {
				dp.get(i).set(j, 0);
			}
		}
		
		for(int idx = n-1;idx>=0;idx--) {
			for(int prev_idx = idx-1; prev_idx >= -1;prev_idx--) {
				int take = Integer.MIN_VALUE, notTake;
				notTake = dp.get(idx+1).get(prev_idx + 1);
				
				if(prev_idx == -1 || arr[idx] > arr[prev_idx])
					take = dp.get(idx+1).get(idx+1) + 1;
				int temp = Math.max(take, notTake);
				dp.get(idx).set(prev_idx + 1,  temp);
			}
			
		}
		return dp.get(0).get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 4, 11, 1, 16, 8};
		int n = arr.length;
		
		dp = new ArrayList<>(n + 1);
		for(int i=0;i<=n; i++) {
			ArrayList<Integer> row = new ArrayList<>(n + 1);
			for(int j=0; j<=n;j++) {
				row.add(-1); 
			}
			dp.add(row);
		}

//		int ans = helper(arr, n, 0, -1);
		int ans = helperTab(arr, n);
		System.out.println("LIS: " + ans);
	}

}
