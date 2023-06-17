package factory;

public class Runner {

	public static void main(String[] args) {

		CarFactory factory = new CarFactory();
		Car car = factory.getInstance("small");
		car.construct();
	}

}
