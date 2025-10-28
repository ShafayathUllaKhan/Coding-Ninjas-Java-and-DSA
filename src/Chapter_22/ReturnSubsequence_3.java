package Chapter_22;

public class ReturnSubsequence_3 {
	
	public static String[] subsequences(String str) {
		
		if(str.isEmpty()) {
			String[] output = new String[1];
			output[0]  = "";
			return output;
		}
		
		String[] smallOutput = subsequences(str.substring(1));
		String[] output = new String[2*smallOutput.length];
		int i=0;
		for(String s:smallOutput) {
			output[i] = s;
			i++;
			output[i] = str.charAt(0)+s;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output[] = subsequences("abc");
		for(String o:output) {
			System.out.println(o);
		}

	}

}
