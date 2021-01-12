package com.java.dp.builder;

import com.java.dp.builder.house.type.HouseType;
import com.java.dp.builder.house.type.OneBHKHouse;
import com.java.dp.builder.output.House;

public class Builder {

	public static void main(String[] args) {
		HouseType oneBHK = new OneBHKHouse(); 
        CivilEngineer engineer = new CivilEngineer(oneBHK); 
        engineer.createHouseStructure(); 
        House house = engineer.createBHKType(); 
  
        System.out.println("Builder constructed: "+ house); 

	}

}
