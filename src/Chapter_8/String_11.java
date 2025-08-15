package Chapter_8;

public class String_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String vs String Buffer
		
		// java.lang is imported implictely
		
		StringBuffer sb = new StringBuffer("Hello");// capacity is 16 characters but it will expand
		
		System.out.println(sb.length());// 5
		System.out.println(sb.capacity());// 16 21 hello is added thats why it is 21
		// does not create a string in string pool again and again
		
		
		
		
	}

}
