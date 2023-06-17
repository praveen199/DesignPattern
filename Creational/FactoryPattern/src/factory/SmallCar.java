package factory;

public class SmallCar implements Car{

	@Override
	public void construct() {
		System.out.println("Small Car Constructed");
	}
}
