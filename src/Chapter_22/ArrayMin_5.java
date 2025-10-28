package Chapter_22;

public class ArrayMin_5 {
	
	public static int getMinHelper(int a[],int startIndex) {
		if(startIndex == a.length) {
			return Integer.MAX_VALUE;
		}
		
		int minimumOfSmallerArray = getMinHelper(a,startIndex + 1);
		int ans = Math.min(minimumOfSmallerArray, a[startIndex]);
		return ans;
	}
	
	public static int getMin(int a[]) {
		int m = getMinHelper(a,0);
		return m;
	}
	
	public static void printMinHelper(int a[],int startIndex,int minSoFar) {
		// base case
		if(startIndex == a.length) {
			System.out.println(minSoFar);
			return;
		}
		
		int newMinSoFar = Math.min(a[startIndex], minSoFar);
		printMinHelper(a,startIndex + 1, newMinSoFar);
	}
	
	public static void printMin(int a[]) {
		printMinHelper(a,0,Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,0,4,-1,-2,5};
		printMin(a);

	}

}
