package Chapter_15;

public class Student implements PrintInterface{
	int rollNumber;
	
	public Student(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(rollNumber);
	}
}
