package Chapter_8;

public class String_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = {'a','b','c','d','e'};
		// char are mutable
		// string are immutable
		
		System.out.println(ch.toString());// this will give the reference in hexa
		System.out.println(System.identityHashCode(ch));// this will give the reference in integer
		String str = "Java";
		System.out.println("String reference "+	System.identityHashCode(str));
		str = "Java1";
		System.out.println("String new reference "+System.identityHashCode(str));
		ch[4] = 'l';
		System.out.println(ch);// see this is mutable but string is not
		System.out.println(System.identityHashCode(ch));
		
	}

}
