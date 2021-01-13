package com.java.dp.template.test;

import com.java.dp.template.House;
import com.java.dp.template.impl.ConcreteWallHouse;
import com.java.dp.template.impl.GlassWallHouse;

public class Demo {

	public static void main(String[] args) {
		House house = new ConcreteWallHouse();
        house.buildhouse();

        System.out.println("********************");
        
        house = new GlassWallHouse();
        house.buildhouse();
        
	}

}
