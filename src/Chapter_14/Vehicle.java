package Chapter_14;

public class Vehicle {
	Vehicle(){
		System.out.println("Vehicle default constructor");
	}
	
	Vehicle(String color){
		this.color = color;
		System.out.println("Vehicle super default constructor");
	}
	
	private String color; // cannot access by child object
	int maxSpeed;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("Vehicle " + " color "+ color + " maxSpeed "+ maxSpeed);
	}
}
