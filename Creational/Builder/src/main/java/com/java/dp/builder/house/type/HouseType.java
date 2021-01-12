package com.java.dp.builder.house.type;

import com.java.dp.builder.output.House;

public interface HouseType {

	public void buildBasement(); 
    public void buildStructure(); 
    public void bulidRoof(); 
    public void buildInterior(); 
    public House createBHKTypeHouse(); 
}
