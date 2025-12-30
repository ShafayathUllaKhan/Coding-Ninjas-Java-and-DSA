package Chapter_24;

import java.util.ArrayList;

public class UnboundedKnapsack {
	static ArrayList<ArrayList<Integer>> dp;
	
	private static int helper(int[] coins, int amt, int idx) {
		//Base
		if(amt == 0) return 0;
		if(idx < 0) return Integer.MAX_VALUE - 1;
		
		if(dp.get(idx).get(amt) != -1) return dp.get(idx).get(amt);
		
		// Choices
		int take = Integer.MAX_VALUE, notTake;
		
		notTake = helper(coins, amt, idx-1);
		if(coins[idx] <= amt) {
			take = 1 + helper(coins, amt - coins[idx],idx);
		}
		
		//Optimal
		int temp = Math.min(take, notTake);
		dp.get(idx).set(amt, temp);
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = {1, 2, 5};
		int n = coins.length, amt = 11;
		
		dp = new ArrayList<>(n + 1);
		for(int i=0;i<=n; i++) {
			ArrayList<Integer> row = new ArrayList<>(amt + 1);
			for(int j=0; j<=amt;j++) {
				row.add(-1); //memozition
			}
			dp.add(row);
		}
		
		int ans = helper(coins, amt , n-1);
		if(ans == Integer.MAX_VALUE - 1)
			System.out.println("Not possible");
			else
				System.out.println("Minimum coins: " + ans);

	}

}
