package factory;

public class LuxuaryCar implements Car {

	@Override
	public void construct() {
		System.out.println("Luxuary Car Constructed");
	}
}
