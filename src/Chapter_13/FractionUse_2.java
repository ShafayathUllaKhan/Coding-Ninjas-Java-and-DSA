package Chapter_13;

public class FractionUse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction_1 f1 = new Fraction_1(4,6);
		f1.print();
		f1.increment();
		f1.print();
		
		Fraction_1 f2 = new Fraction_1(4,8);
		f1.add(f2);
		f1.print();
		
		Fraction_1 f3 = Fraction_1.add(f1, f2);
		f3.print();
	}

}
