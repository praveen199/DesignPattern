package com.java.dp.car.factory;

import com.java.dp.car.model.CarType;
import com.java.dp.cartype.Car;
import com.java.dp.cartype.LuxuryCar;
import com.java.dp.cartype.SedanCar;
import com.java.dp.cartype.SmallCar;

public class CarFactory {

	public Car buildCar(CarType model) {
		if(model == null) {
			return null;  
		}
		if(model == CarType.SMALL) {
			return new SmallCar();
		}
		if(model == CarType.SEDAN) {
			return new SedanCar();
		}
		if(model == CarType.LUXURY) {
			return new LuxuryCar();
		}
		return null;
	}
}
