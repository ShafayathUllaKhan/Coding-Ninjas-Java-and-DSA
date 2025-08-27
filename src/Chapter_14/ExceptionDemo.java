package Chapter_14;

public class ExceptionDemo {
	
	public static int fact(int n) {
		return 10;
	}
	
	public static int divide(int a, int b) throws DividebyzeroException{
		if(b == 0) {
			throw new DividebyzeroException();
		}
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		// exceptions
		// errors unchecked checked 
		try {
			divide(10,0);
		}catch (DividebyzeroException e) {
			System.out.println("Divide by zero exception raised");
		}finally {
			System.out.println("Finally");
		}
		System.out.println("Main");
		// throws will give you error in runtime by main if you give near args throws DividebyzeroException
	}
}
