package Chapter_14;

public class Rectangle extends Shape{

	int length;
	int breadth;
	
	Rectangle(){
		System.out.println("Rectangle default constructor");
	}
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void draw() {
		System.out.println("Rectangle drawn");
	}
	
	public void info() {
		System.out.println("length "+length+"breadth "+ breadth);
	}
	
	public void info(String type) {
		System.out.println(type + " "+"length "+length+"breadth "+ breadth);
	}
}
