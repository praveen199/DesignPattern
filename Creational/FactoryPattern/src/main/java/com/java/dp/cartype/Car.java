package com.java.dp.cartype;

import com.java.dp.car.model.CarType;

public abstract class Car {

	private CarType model = null;
	public abstract void construct();
	
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
}
