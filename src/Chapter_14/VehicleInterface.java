package Chapter_14;

public interface VehicleInterface {

	// interface is pure abstract
	double PI = 3.14;
	public abstract boolean isMotorized();
	public abstract String getCompany();
	// public abstract you can remove this because the default value is public abstract
}
