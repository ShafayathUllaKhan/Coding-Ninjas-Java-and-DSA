package Chapter_9;

public class Dimensional_Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2d array with different column sizes
		// there are known as jagged arrays
		
	
		int Arr2[][] = {{1,2,3},{4,5,6,7,8,9}};
		
		for(int i = 0;i<Arr2.length;i++) {
			for(int j=0;j<Arr2[i].length;j++) {
				System.out.print(Arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		int Arr[][] = new int[3][];
		
		System.out.println(Arr[0]);// null
		System.out.println(Arr[1]);// null
		System.out.println(Arr[2]);// null
		
		System.out.println(Arr[0][0]);// null pointer exception
		
		// solution
		
		Arr[0] = new int[5];
		Arr[1] = new int[7];
		Arr[2] = new int[10];
		
		System.out.println(Arr[0]);// [I@7106e68e
		System.out.println(Arr[1]);// [I@7eda2dbb
		System.out.println(Arr[2]);// [I@6576fe71
		
		System.out.println(Arr[0][0]);// 0
		
	}

}
