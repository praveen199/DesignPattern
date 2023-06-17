package factory;

public class CarFactory {


	public Car getInstance(String name) {
		if(name == "small") {
			return new SmallCar();
		}
		if(name == "luxuary") {
			return new LuxuaryCar();
		}
		return null;
	}
}
