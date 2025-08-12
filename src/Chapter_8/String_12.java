package Chapter_8;

public class String_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "pqrs";
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			for(int j= i + 1;j<= str.length();j++) {
				System.out.println(str.substring(i,j));
				count++;
			}
		}
		System.out.println("The total substring is "+ count);
	}
	

}
