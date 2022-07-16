package com.java.dp.builder;

public class Phone {

	private int ram;
	private String screen;
	private String camera;
	private String battery;
	private String processor;
	
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Phone(int ram, String screen, String camera, String battery, String processor) {
		super();
		this.ram = ram;
		this.screen = screen;
		this.camera = camera;
		this.battery = battery;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Phone [ram=" + ram + ", screen=" + screen + ", camera=" + camera + ", battery=" + battery
				+ ", processor=" + processor + "]";
	}
	
	
	
}
