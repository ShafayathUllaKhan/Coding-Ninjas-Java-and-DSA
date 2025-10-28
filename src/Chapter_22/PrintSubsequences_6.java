package Chapter_22;

public class PrintSubsequences_6 {
	
	public static void printSubsequencesHelper(String s,String strSoFar) {
		if(s.length() == 0) {
			System.out.println(strSoFar);
			return;
		}
		printSubsequencesHelper(s.substring(1),strSoFar);
		printSubsequencesHelper(s.substring(1),strSoFar + s.charAt(0));
	}
	public static void printSubsequences(String s) {
		printSubsequencesHelper(s,"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubsequences("abc");
	}
}
