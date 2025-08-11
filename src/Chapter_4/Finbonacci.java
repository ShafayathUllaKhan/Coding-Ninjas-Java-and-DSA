package Chapter_4;

import java.util.Scanner;

public class Finbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");  // print current number
            int next = a + b;           // calculate next number
            a = b;                      // move forward
            b = next;
        }
	}

}
