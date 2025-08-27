package Chapter_14;

public class Car extends Vehicle {
//	Car(){
//		System.out.println("Car default constructor");
//	}// Vehicle constructor is called and then car constructor is called
	
	Car(){
		super("white");
		System.out.println("Car default constructor");
	}
	
	int numDoors;
	int maxSpeed;
	public void printCar() {
		System.out.println("Car " + " color " + getColor() + " maxspeed "+ maxSpeed + " numDoors "+ numDoors);
	}
	
	public void print() {
		System.out.println("Function overiding "+"Vehicle " + " color "+ getColor() + " maxSpeed "+ maxSpeed);
	} // function overriding 
	
	public void printMaxSpeed() {
		System.out.println("maxspeed" + maxSpeed + "vehicle maxspeed" + super.maxSpeed);
	}
	
}
