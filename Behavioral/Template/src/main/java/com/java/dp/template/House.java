package com.java.dp.template;

public abstract class House {

	private final void constructBase() {
		System.out.println("Base has been constructed.");
	}

	private final void constructRoof() {
		System.out.println("Roof has been constructed.");
	}

	public abstract void constructWalls();
	public abstract void constructWindows();
	public abstract void constructDoors();
	public abstract void paintHouse();
	public abstract void decorateHouse();
	
	public final void buildhouse() {
        constructBase();
        constructRoof();
        constructWalls();
        constructWindows();
        constructDoors();
        paintHouse();
        decorateHouse();
    }
}
