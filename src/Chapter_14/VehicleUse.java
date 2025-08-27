package Chapter_14;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.setColor("Red");
		v.maxSpeed = 80;
		v.print();
		
		Car c = new Car();
		c.setColor("Black");
		c.maxSpeed = 100;
		c.numDoors = 4;
		//c.print();
		c.printCar();
		c.print();
		c.printMaxSpeed();
		
		Bicycle b = new Bicycle();
		b.print();
		
		// class cast and object class
		
		Vehicle v1 = new Car();
		v1 = new Bicycle();
		Car c1 = (Car) v; // class cast
		c1.numDoors = 3;
		
		// object class
		Object o = new Vehicle();
		
	}

}
