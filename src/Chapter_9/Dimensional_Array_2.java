package Chapter_9;

import java.util.Scanner;

public class Dimensional_Array_2 {
	
	
	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		
		System.out.println("Enter number of columns");
		int columns = sc.nextInt();
		int array[][] = new int[row][columns];
		for(int i=0;i<row;i++) {
			System.out.println("Enter the element of "+i);
			for(int j=0;j<columns;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		return array;
	}
	
	public static void printArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int longestCol(int arr[][]) {
		int count = Integer.MIN_VALUE;;
		int largest = Integer.MIN_VALUE;;
		for(int j=0;j<arr[0].length;j++) {
			
			for(int i=0;i<arr.length;i++) {
				count = count + arr[i][j]; 
			}
			if(count > largest) {
				largest = count;
			}
			count = 0;
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = takeInput();
		printArray(arr);
		
		// for each loop
		
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println(longestCol(arr));
	}

}
