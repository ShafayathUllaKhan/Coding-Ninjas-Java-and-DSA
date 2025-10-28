package Chapter_22;

public class PrintKeypad_7 {
	
	public static String getKeyPadStr(int i) {
		String[] a = {" ",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return a[i];
	}
	
	public static void printKeypadHelper(int num,String strSoFar) {
		if(num == 0) {
			System.out.println(strSoFar);
			return;
		}
		int lastDigit = num % 10;
		int remainingNumber = num/10;
		
		String options = getKeyPadStr(lastDigit);
		
		for(int i=0;i<options.length();i++) {
			printKeypadHelper(remainingNumber,options.charAt(i)+strSoFar);
		}
	}
	
	public static void printKeypad(int num) {
		printKeypadHelper(num,"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeypad(23);
	}

}
