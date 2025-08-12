package Chapter_8;

import java.util.Scanner;

public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		count++;
		System.out.println("The number of words are " + count);
		
		String str1[] = str.split(" ");
		
		System.out.println("The number of words are " + str1.length);
		
		
	}

}
