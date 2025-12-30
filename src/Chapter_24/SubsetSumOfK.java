package Chapter_24;

import java.util.ArrayList;

public class SubsetSumOfK {
	static ArrayList<ArrayList<Boolean>> dp;
	
//	private static Boolean helper(int[] arr, int n,int k, int idx) {
//		//Base
//		if(k==0) return true;
//		if(idx < 0) return false;
//		
//		if(dp.get(idx).get(k) != -1) {
//			return dp.get(idx).get(k) == 0 ? false : true;
//		}
//		//Choices
//		Boolean take = false, notTake;
//		notTake = helper(arr, n, k, idx-1);
//		if(arr[idx] <= k)
//		    take = helper(arr, n, k-arr[idx], idx-1);
//		
//		//Optimal
//		Boolean temp = take || notTake;
//		dp.get(idx).set(k,  temp == true ? 1 : 0);
//		return temp;
//		
//	}
	
	private static Boolean helperTab(int[] arr, int n, int k) {
		for(int i =0; i<=n;i++) {
			dp.get(i).set(0, true);
		}
		for(int i=1;i<=k;i++) {
			dp.get(0).set(i, false);
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				Boolean take = false, notTake;
				notTake = dp.get(i-1).get(j);
				if(j >= arr[i - 1])
					take = dp.get(i - 1).get(j - arr[i-1]);
				dp.get(i).set(j,  take || notTake);
			}
		}
		return dp.get(n).get(k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4};
		int n = 4, k = 4;
		
		dp = new ArrayList<>(n + 1);
		for(int i=0;i<=n; i++) {
			ArrayList<Boolean> row = new ArrayList<>(k + 1);
			for(int j=0; j<=k;j++) {
				row.add(false); 
			}
			dp.add(row);
		}
		
//		Boolean ans = helper(arr, n, k, n-1);
		Boolean ans = helperTab(arr, n, k);
		if(ans)
			System.out.println("Subset sum of K: possible");
		else
			System.out.println("Subset sum of K: not possible");
	}

}
 