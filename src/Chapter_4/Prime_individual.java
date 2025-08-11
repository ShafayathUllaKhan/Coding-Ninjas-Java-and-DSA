package Chapter_4;

import java.util.Scanner;

public class Prime_individual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(;n>=1;) {
			int last = n%10;
			System.out.println(last);
			n= n/10;
		}
		
	}

}
