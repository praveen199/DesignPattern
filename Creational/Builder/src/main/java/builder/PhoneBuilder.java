package com.java.dp.builder;

public class PhoneBuilder {

	private int ram;
	private String screen;
	private String camera;
	private String battery;
	private String processor;
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreen(String screen) {
		this.screen = screen;
		return this;
	}
	public PhoneBuilder setCamera(String camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(ram, screen, camera, battery, processor);
		
	}
	
	
}
