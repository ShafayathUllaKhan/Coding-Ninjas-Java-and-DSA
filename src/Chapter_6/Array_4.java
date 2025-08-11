package Chapter_6;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value of " + i + " Index");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
