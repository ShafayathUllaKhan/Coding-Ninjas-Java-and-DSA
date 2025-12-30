package Chapter_24;

import java.util.ArrayList;

public class PartitionEqual_Subset_Sum {
	
	static ArrayList<ArrayList<Integer>> dp;
	static ArrayList<ArrayList<Boolean>> dpTab;
	
	private static Boolean helper(int[] arr, int n,int k, int idx) {
		//Base
		if(k==0) return true;
		if(idx < 0) return false;
		
		if(dp.get(idx).get(k) != -1)
			return dp.get(idx).get(k) == 0 ? false : true;
		//Choices
		Boolean take = false, notTake;
		notTake = helper(arr, n, k, idx-1);
		if(arr[idx] <= k)
		    take = helper(arr, n, k-arr[idx], idx-1);
		
		//Optimal
		Boolean temp = take || notTake;
		dp.get(idx).set(k,  temp == true ? 1 : 0);
		return temp;
		
	}
	
	private static Boolean helperTab(int[] arr, int n, int k) {
		for(int i =0; i<=n;i++) {
			dpTab.get(i).set(0, true);
		}
		for(int i=1;i<=k;i++) {
			dpTab.get(0).set(i, false);
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				Boolean take = false, notTake;
				notTake = dpTab.get(i-1).get(j);
				if(j >= arr[i - 1])
					take = dpTab.get(i - 1).get(j - arr[i-1]);
				dpTab.get(i).set(j,  take || notTake);
			}
		}
		return dpTab.get(n).get(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,5,11,5};
		int n = 4, k = 0;
		
		for(int i=0;i<n;i++) {
			k = k + arr[i];
		}
		
		dpTab = new ArrayList<>(n + 1);
		for(int i=0;i<=n; i++) {
			ArrayList<Boolean> row = new ArrayList<>(k + 1);
			for(int j=0; j<=k;j++) {
				row.add(false); 
			}
			dpTab.add(row);
		}
		
		Boolean ans;
		if(k%2 == 1)
			ans = false;
		else
			k = k/2;
//			ans = helper(arr, n, k, n-1);
		    ans = helperTab(arr, n, k);
		
		
		if(ans)
			System.out.println("Partition equal Subset sum : possible");
		else
			System.out.println("Partition equal Subset sum : not possible");
	}

}
