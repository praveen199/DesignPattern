package com.java.dp.bridge;

import com.java.dp.Assemble.Assemble;
import com.java.dp.Assemble.Produce;
import com.java.dp.Vehicle.Bike;
import com.java.dp.Vehicle.Car;

public class BridgePattern {

	public static void main(String[] args) {
		
		Car vehicle1 = new Car(new Produce(), new Assemble()); 
        vehicle1.manufacture(); 
        
        Bike vehicle2 = new Bike(new Produce(), new Assemble()); 
        vehicle2.manufacture();

	}
}
