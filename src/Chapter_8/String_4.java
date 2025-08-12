package Chapter_8;

import java.util.Scanner;

public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// nextLine()
		// spaces are delimeter and character is token and /n is also delimeter
		String str = sc.nextLine(); // /n
		System.out.println(str);
		
		// next()
		String str1 = sc.next(); // /n and space
		System.out.println(str1);// hello my name is shafayath prints hello
		
		String str2 = sc.next(); // /n and space
		System.out.println(str2);// prints my
		
	}

}
