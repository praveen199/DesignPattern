package com.java.dp.builder;

import com.java.dp.builder.house.type.HouseType;
import com.java.dp.builder.output.House;

public class CivilEngineer {

	private HouseType houseType; 
    public CivilEngineer(HouseType houseType) {
		this.houseType = houseType;
	}
    
    public void createHouseStructure() { 
        this.houseType.buildBasement(); 
        this.houseType.buildStructure(); 
        this.houseType.bulidRoof(); 
        this.houseType.buildInterior(); 
    } 
    
	public House createBHKType() { 
        return this.houseType.createBHKTypeHouse(); 
    } 
}
