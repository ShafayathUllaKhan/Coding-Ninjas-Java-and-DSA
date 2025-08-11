package Chapter_6;

import java.util.Scanner;

public class Methods_1 {
	
	static int Squared(int n) {
		return n * n;
	}
	
	static int Sum(int n,int a) {
		n++;
		System.out.println(n);// 2
		return n + a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Methods sample = new Methods();
//		System.out.println(sample.Squared(5));
		System.out.println(Squared(5));
//		main is a static method.
//		Static methods can’t directly call non-static (instance) methods without creating an object first, because instance methods need an object to work on.


		// pass by value
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		System.out.println(Sum(n,num));// 1 2 output is 4
		System.out.println(n);// 1
		
		// method calling method
		
		// method overloading
		// 1. no of arguments
		// 2. types should be different
		// like parameter int or double
		// if no arguments are same 
		
		// call stack
		
		
	}

}
