package Chapter_8;

public class String_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// palindrome
		
		 String str1 = "madam";

	        char[] arr = str1.toCharArray(); // convert to char array

	        for (int i = 0; i < arr.length / 2; i++) {
	            char temp = arr[i];
	            arr[i] = arr[arr.length - i - 1];
	            arr[arr.length - i - 1] = temp;
	        }

	        String reversed = new String(arr); // convert back to string
	        System.out.println(reversed);

	        if (str1.equals(reversed)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	}

}
