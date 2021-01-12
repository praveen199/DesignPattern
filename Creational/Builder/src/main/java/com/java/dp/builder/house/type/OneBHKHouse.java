package com.java.dp.builder.house.type;

import com.java.dp.builder.output.House;

public class OneBHKHouse implements HouseType {

	private House house;
	public OneBHKHouse() {
		this.house = new House();
	}

	public void buildBasement() {
		house.setBasement("OneBHKHouse Basement");
	}

	public void buildStructure() {
		house.setStructure("OneBHKHouse Structure"); 
	}

	public void bulidRoof() {
		house.setInterior("OneBHKHouse Roof"); 
	}

	public void buildInterior() {
		house.setRoof("OneBHKHouse Interior"); 
	}

	public House createBHKTypeHouse() {
		return this.house;
	}

}
