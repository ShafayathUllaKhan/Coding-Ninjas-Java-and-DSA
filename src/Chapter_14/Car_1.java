package Chapter_14;

public class Car_1 extends Vehicle_1 implements VehicleInterface,CarInterface{

	// a class can extends and implement both and a class can implement more interface and class can extends only once and multiple inheritance is not there in java but you can achieve multiple inheritance by using interface
	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numGears() {
		// TODO Auto-generated method stub
		return 0;
	}

	// you dont want to implement this methods make abstract the Vehicle_1 class
	
	// note :- method clash can be define once in Car_1 but variable clash will give you error
}
