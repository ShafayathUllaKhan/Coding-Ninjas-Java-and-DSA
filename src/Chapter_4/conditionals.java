package Chapter_4;

import java.util.Scanner;

public class conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if and if else
		
		// prime number or not
		// 1 and itself 2,3,5,7,11,13,17
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean flag = false;
		if(n > 2) {
			for(int i = 2;i<n;i++) {
				if(n%i == 0) {
					flag = true;
				}
			}
			
			
			if(flag) {
					System.out.println("Not a prime number");
			}else {
				System.out.println("prime number");
			}
		}else {
			System.out.println("Not a prime number");
		}
		
		
		// first 4 even numbers
		
		int j = 4;
		for(int i = 1;i<= 50 && j >0;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				j--;
			}
		}	
		
		// prime individual digit
		
		
		// factorial series
		
		// prime number till 50
		
		
	}
}
