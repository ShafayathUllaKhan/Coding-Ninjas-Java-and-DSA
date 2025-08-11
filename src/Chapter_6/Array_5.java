package Chapter_6;

import java.util.Scanner;

public class Array_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value of " + i + " Index");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("Largest is "+ largest);
		
		int max1 = arr[0];
		int max2 = Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(max1 < arr[i]) {
				max2 = max1;
				max1 = arr[i];
			}else if(max2 < arr[i] && arr[i] != max1) {
				max2 = arr[i];
			}
		}
		System.out.println("Second largest is " + max2);
	}
}
