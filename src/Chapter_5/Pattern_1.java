package Chapter_5;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1;i<= num;i++) {
			for(int j= 1;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		
		for(int i = 1;i<= num;i++) {
			for(int j= 1;j<=num;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		for(int i = 1;i<= num;i++) {
			for(int j= 1;j<=num;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		for(int i = 1;i<= num;i++) {
			for(int j= num;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		for(int i = 1;i<= num;i++) {
			for(int j= 1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		for(int i = 1;i<= num;i++) {
			for(int j= 1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		for(int i = 1;i<= num;i++) {
			for(int j= 1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		int p = 1;
		for(int i = 1;i<= num;i++) {
			for(int j= 1;j<=i;j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		
		for(int i = 1;i<= num;i++) {
			int c = i;
			for(int j= 1;j<=i;j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing other Pattern");
		System.out.println();
		
		for(int i = 1;i<= num;i++) {
			
			for(int k= 1;k<=num-i;k++) {
				System.out.print(" ");
			}
			for(int j= 1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//	    1
//	   123
//	  12345
//	 1234567
//	123456789

	}

}
