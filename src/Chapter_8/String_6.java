package Chapter_8;

public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Meomary Allocation
		
		String s1 = "Java";// stored in string pool and in pool it will 
		//check if string is there or not if string is there it will 
		//pass the same reference id and in heap it will not check
		String s2 = "java";// stored in string pool
		String s3 = "Java";// same reference will passed 
		
		String str1 = new String("Java");// stored in heap and new reference id 
		String str2 = new String("Java");// stored in heap and new reference id 
		String str3 = new String("java");// stored in heap and new reference id 
		
		System.out.println(s1 == s3);// true
		System.out.println(s1 == s2);// false
		System.out.println(str1 == str2);// false
		System.out.println(str1 == s1);// false
		System.out.println(str3 == s2);// false
		System.out.println(str1.equals(str2));// true
		System.out.println(System.identityHashCode(s1));// 1706234378
		System.out.println(System.identityHashCode(s2));// 1867750575
		System.out.println(System.identityHashCode(s3));// 1706234378
		
	}

}
