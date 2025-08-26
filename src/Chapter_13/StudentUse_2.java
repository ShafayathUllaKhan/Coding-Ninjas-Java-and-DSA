package Chapter_13;

public class StudentUse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_1 s1 = new Student_1("shafayath",1);
		System.out.println(s1);// Chapter_13.Student_1@6f539caf
		// s1 is stored in stack and new Student_1(); is stored in heap
//		System.out.println(s1.name + s1.rollNumber);// null 0
//		
//		s1.name = "Shafayath";
//		s1.rollNumber = 10;
//		
//		System.out.println(s1.name + s1.rollNumber);
//		
		s1.print();
		
		System.out.println(s1.conversionFactor);// you can access static variable but you will get warning
		
		System.out.println(Student_1.conversionFactor);
		
		//Student_1.conversionFactor = 0.96; The final field Student_1.conversionFactor cannot be assigned
		
		Student_1.numStudents = 30;// you can change a static variable
		
		System.out.println(Student_1.numStudents);
		
	}

}
