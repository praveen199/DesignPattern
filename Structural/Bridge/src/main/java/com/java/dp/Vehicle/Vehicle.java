package com.java.dp.Vehicle;

import com.java.dp.Assemble.Workshop;

abstract class Vehicle {

	public Workshop workShop1; 
	public Workshop workShop2; 
  
	public Vehicle(Workshop workShop1, Workshop workShop2) { 
        this.workShop1 = workShop1; 
        this.workShop2 = workShop2; 
    } 
	abstract public void manufacture(); 
}
