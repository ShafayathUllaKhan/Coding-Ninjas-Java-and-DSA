package Chapter_11;

public class Recursion_1 {

	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
	 
		return n * fact(n-1);
	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
	 
		return n + sum(n-1);
	}
	public static void naturalNumbers(int n) {
		if(n==0) {
			return ;
		}
		
		naturalNumbers(n-1);
		System.out.print(n);
		return;
	}
	public static int fibonacci(int n) {
		if(n==1 || n== 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(sum(10));
		naturalNumbers(10);
		System.out.println();
		System.out.println(fibonacci(5));
	}

}
