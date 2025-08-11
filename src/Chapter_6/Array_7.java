package Chapter_6;

public class Array_7 {
	
	public static int[] increment(int arr[]) {
		int B[] = new int[5];
		for(int i=0;i<B.length;i++) {
			B[i] = B[i] + 2;
		}
		return B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5};
		arr = increment(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
