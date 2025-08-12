package Chapter_8;

import java.util.Scanner;

public class String_9 {
	
	public static String reverse(String str,int start,int end) {
		String reverseString = "";
		for(int i=end;i>=start;i--) {
			reverseString = reverseString + str.charAt(i);
		}
		return reverseString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse each word
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = "";
		int start = 0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) == ' ') {
				int end = i-1;
				String reverse = reverse(str1,start,end);
				reverse = reverse + " ";
				start = i + 1;
				str2 = str2 + reverse;
			}else if(i== str1.length()-1) {
				int end = i;
				String reverse = reverse(str1,start,end);
				reverse = reverse + " ";
				start = i + 1;
				str2 = str2 + reverse;
			}
		}
		
		System.out.println(str2);
	}

}
