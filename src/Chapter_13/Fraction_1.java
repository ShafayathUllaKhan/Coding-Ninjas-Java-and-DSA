package Chapter_13;

public class Fraction_1 {

	private int numerator;
	private int denominator;
	
	public Fraction_1(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i=2;i<=smaller;i++) {
			if(numerator % i == 0 && denominator % i ==0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}
	
	public void add(Fraction_1 f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
		
	}
	
	public static Fraction_1 add(Fraction_1 f1,Fraction_1 f2) {
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		Fraction_1 f3 = new Fraction_1(newNum,newDeno);
		return f3;
	}
}
