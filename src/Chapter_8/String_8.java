package Chapter_8;

import java.util.Scanner;

public class String_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse a String
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String revString = "";
		for(int i = str1.length()-1;i>=0;i--) {
			revString = revString + str1.charAt(i);
		}
//		for(int i = 0;i<str1.length();i++) {
//			revString = str1.charAt(i) + revString;
//		}
		System.out.println(revString);
		
//		What really happens
//		Strings in Java are immutable — once created, they can’t be changed.
//
//		When you do revString + str1.charAt(i), Java:
//
//		Creates a new String object in memory containing the old revString content plus the new character.
//
//		Assigns that new object’s reference back to revString.
//
//		The old string object is left for garbage collection (if no other reference points to it).
//
//		So the reference changes every time
//		Example:
//		revString (initial) → ""   (empty string object in memory)
//		Step 1: add 'a' → new object "a" → revString points to this
//		Step 2: add 'b' → new object "ab" → revString points here
//		Step 3: add 'c' → new object "abc" → revString points here
//		The old objects "a" and "ab" are no longer used and can be collected.
		
	}

}
