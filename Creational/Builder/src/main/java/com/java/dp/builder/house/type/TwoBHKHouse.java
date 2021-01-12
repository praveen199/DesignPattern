package com.java.dp.builder.house.type;

import com.java.dp.builder.output.House;

public class TwoBHKHouse implements HouseType {

	private House house;
	public TwoBHKHouse() {
		this.house = new House();
	}

	public void buildBasement() {
		house.setBasement("TwoBHKHouse Basement");
	}

	public void buildStructure() {
		house.setStructure("TwoBHKHouse Structure"); 
	}

	public void bulidRoof() {
		house.setInterior("TwoBHKHouse Roof"); 
	}

	public void buildInterior() {
		house.setRoof("TwoBHKHouse Interior"); 
	}

	public House createBHKTypeHouse() {
		return this.house;
	}
}
