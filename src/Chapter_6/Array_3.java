package Chapter_6;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring a variable
		int a;
		
		// declaring an array
		int arr[] = new int[10]; // by default the compiler gives 0s in memory for 10 elements 
		int []arr1 = {1,2,3,4,5};
		int[] arr2;
		
		// for each
		for(int i:arr1) {
			System.out.println(i);
		}
	}

}
