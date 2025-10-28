package Chapter_22;

public class ReturnKeypad_4 {
	
	public static String getKeyPadStr(int i) {
		String[] a = {" ",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return a[i];
	}
	
	public static String[] getKeypadCombinations(int input) {
		if(input == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallOutput = getKeypadCombinations(input/10);
		int lastDigit = input%10;
		String possibleChars = getKeyPadStr(lastDigit);
		
		String[] output = new String[smallOutput.length * possibleChars.length()];
		int k = 0;
		for(String s : smallOutput) {
			for(int  i = 0;i<possibleChars.length();i++) {
				
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] output = getKeypadCombinations(234);
		for(String s:output) {
			System.out.println(s);
		}
	}

}
