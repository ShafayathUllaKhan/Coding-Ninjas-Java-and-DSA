package Chapter_13;

public class Student_1 {
	private String name;
	final private int rollNumber;// either the value should be assigned while declaring or in constructor
	double cgpa;
	static final double conversionFactor = 0.95;// when you use static final use caps like CONVERSIONFACTOR
	static int numStudents = 20;
	
	public Student_1(String name,int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		// conversionFactor = 0.95; // The final field Student_1.conversionFactor cannot be assigned
	}
	
//	public Student_1(String name) {// if someone wants to create constructor without roll number
//		this.name = name;
//	}
	
	void print() {
		System.out.println(name + " " + rollNumber);
	}
	
	String getter() {
		return name;
	}
	
	public int getter_rollnumber() {
		return rollNumber;
	}
	
	public void setRollnumber(int rollNumber){
		if(rollNumber <=0) {
			return;
		}
		// this.rollNumber = rollNumber;// reference to current object
	}
	// Access Modifier
	// 1. private all the variable and function are accesible within the class(read and write) 2. default 3. public 4. protected
	
	public static double getConversionFactor() {
		return conversionFactor; // non static properties will not work
		
	}
	
}
