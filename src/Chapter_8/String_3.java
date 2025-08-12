package Chapter_8;

public class String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coding is good.";

        /** Methods in String */

        // length()
        System.out.println(str.length());
        
        // charAt()
        // toLowerCase(), toUpperCase()

        // trim()
        System.out.println(str.trim());

        // substring()
        System.out.println(str.substring(5));
        System.out.println(str.substring(7, 9));

        // replace()
        System.out.println(str.replace('o', '@'));
        
        // indexOf()
        System.out.println(str.indexOf('o',5)); // 11
        
        // lastIndex
        int lastIndex = str.lastIndexOf('g');
        System.out.println(lastIndex);
        
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));// false
        
        // compareTo()
        System.out.println(s2.compareTo(s1)); // 32 it subtract the s1 ascii value and give 32
        
        
        

	}

}
