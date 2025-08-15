package Chapter_11;

public class Recursion_2 {
	
	public static boolean isSorted(int n[]) {
		if(n.length == 1) {
			return true;
		}
		if(n[0] > n[1]) {
			return false;
		}
		int smallArray[] = new int[n.length -1];
		for(int i=1;i< n.length;i++) {
			smallArray[i-1] = n[i];
		}
		boolean isSmallArraySorted = isSorted(smallArray);
		return isSmallArraySorted;
	}
	
	public static boolean isSortedBetter(int a[],int si) {
		if(si == a.length-1) {
			return true;
		}else if(a[si] > a[si + 1]){
			return false;
		}
		return isSortedBetter(a,si+1);
	}
	
	public static int firstIndex(int a[],int x) {
		if(a.length == 0) {
			return -1;
		}
		if(a[0] == x) {
			return 0;
		}
		int smallArray[] = new int[a.length-1]; 
		for(int i=1;i<a.length;i++) {
			smallArray[i-1] = a[i];
		}
		int result = firstIndex(smallArray,x);
		if(result == -1) {
			return -1;
		}else {
			return result + 1;
		}
	}
	
	public static int firstIndexBetter(int a[],int x,int si) {
		if(si==a.length) {
			return -1;
		}
		if(a[si] == x) {
			return si;
		}
		return firstIndexBetter(a,x,si + 1);
}
	
	public static int LastIndex(int a[],int target) {
		if(a.length == 0) {
			return -1;
		}
		int smallarray[] = new int[a.length - 1];
		for(int i=1;i<a.length;i++) {
			smallarray[i-1] = a[i];
		}
		int result = LastIndex(smallarray,target);
		
		if(result != -1) {
			return result + 1;
		}
		
		if(a[0] == target) {
			return 0;
		}
		
		return -1;
}
	
	public static int LastIndexBetter(int a[],int target,int si) {
		if(si >= a.length) {
			return -1;
		}
		int result = LastIndexBetter(a,target,si+1);
		
		if(result != -1) {
			return result + 1;
		}
		
		if(a[si] == target) {
			return 0;
		}
		
		return -1;
	}
	
	public static boolean StringPalindrome(String str) {
		if(str.length() == 0 || str.length() == 1) {
			return true;
		}
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return StringPalindrome(str.substring(1,str.length()-1));
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,2};
		System.out.println(isSorted(a));
		System.out.println(isSortedBetter(a,0));
		System.out.println(firstIndex(a,3));
		System.out.println(firstIndexBetter(a,3,0));
		System.out.println(LastIndex(a,2));
		System.out.println(LastIndexBetter(a,2,0));
		System.out.println(StringPalindrome("sose"));
	}

}
