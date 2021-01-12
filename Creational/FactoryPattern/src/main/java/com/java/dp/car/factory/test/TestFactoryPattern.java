package com.java.dp.car.factory.test;

import com.java.dp.car.factory.CarFactory;
import com.java.dp.car.model.CarType;
import com.java.dp.cartype.Car;

public class TestFactoryPattern {

	public static void main(String[] args) {

		CarFactory carFactory = new CarFactory();
		Car smallCar = carFactory.buildCar(CarType.SMALL);
		smallCar.construct();
		
		Car sedanCar = carFactory.buildCar(CarType.SEDAN);
		sedanCar.construct();
		
		Car luxuryCar = carFactory.buildCar(CarType.LUXURY);
		luxuryCar.construct();
		
	}
}