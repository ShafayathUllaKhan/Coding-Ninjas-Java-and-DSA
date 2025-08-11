package Chapter_5;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char a = 'A';
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				char sample = (char) (a + (j-1));
				System.out.print(sample);
			}
			System.out.println();
//		    ABCDE
//			ABCDE
//			ABCDE
//			ABCDE
//			ABCDE
		}
		
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		
		for(int i=1;i<=num;i++) {
			char b = (char)(65 + (i-1));
			for(int j=1;j<=num;j++) {
				System.out.print((char)(b + (j-1)));
			}
			System.out.println();
//		   ABCDE
//         BCDEF
//		   CDEFG
//		   DEFGH
//		   EFGHI
		}
		
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num - i+1;j++) {
				System.out.print('*');
			}
			System.out.println();
//		    *****
//			****
//			***
//			**
//			*
		}
		
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		
		for(int i=1;i<=num;i++) {
			
			for(int k=1;k<=num-i;k++) {
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
//		    *
//		    **
//		   ***
//		  ****
//		 *****
		}
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		
		for(int i=1;i<=num;i++) {
			
			for(int k=1;k<=i-1;k++) {
				System.out.print(' ');
			}
			for(int j=1;j<=num - (i-1);j++) {
				System.out.print('*');
			}
			System.out.println();
//			*****
//			 ****
//			  ***
//			   **
//			    *
		}
		
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		
		for(int i=1;i<=num;i++) {
			
			for(int k=1;k<=num-i;k++) {
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int c=i-1;c>=1;c--) {
				System.out.print(c);
			}
			System.out.println();
//		    1
//		    121
//		   12321
//		  1234321
//		 123454321
		}
		
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		
		for(int i=1;i<=num;i++) {
			
			for(int k=1;k<=num-i;k++) {
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int c=i-1;c>=1;c--) {
				System.out.print("*");
			}
			System.out.println();
//		    1
//		    121
//		   12321
//		  1234321
//		 123454321
		}
		
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		
		for(int i=1;i<=num;i++) {
			
			for(int c=i-1;c>=1;c--) {
				System.out.print(' ');
			}
			for(int j=1;j<=num-(i-1);j++) {
				System.out.print("*");
			}
			for(int k=1;k<=num-i;k++) {
				System.out.print("*");
			}
			System.out.println();
//			*********
//			 *******
//			  *****
//			   ***
//			    *
		}
		for(int i=1;i<=num;i++) {
			
			for(int k=1;k<=num-i;k++) {
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int c=i-1;c>=1;c--) {
				System.out.print("*");
			}
			System.out.println();
//		    1
//		    121
//		   12321
//		  1234321
//		 123454321
		}
		System.out.println();
		System.out.println("Other Pattern");
		System.out.println();
		for(int i=1;i<=num;i++) {
			int sample = i;
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=num - (i-1);j++) {
				System.out.print(sample + " ");
				sample++;
			}
			System.out.println();
		}
		
		for(int i=num-1;i>=1;i--) {
			int sample = i;
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=num - (i-1);j++) {
				System.out.print(sample + " ");
				sample++;
			}
			System.out.println();
		}
	}
}
