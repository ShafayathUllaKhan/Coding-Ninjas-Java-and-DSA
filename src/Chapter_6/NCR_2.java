package Chapter_6;

import java.util.Scanner;

public class NCR_2 {
	
	static int factorial(int num) {
		int fact = 1;
		for(int i = 1 ;i<=num;i++) {
			fact = fact *i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		nCr= 		n!
//				r!⋅(n−r)!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		if (n<0 || r<0) {
			
			System.out.println("No Negative Values");
			return;
					}
		else {
				int factn = factorial(n);
				int factr = factorial(r);
				int factnr = factorial(n-r);
				int ncr = factn / (factr * factnr);
				System.out.println(ncr);

					}
		
	}// returns void internally

}
