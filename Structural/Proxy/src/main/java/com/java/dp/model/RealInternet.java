package com.java.dp.model;

public class RealInternet implements Internet {

	public void connectTo(String serverhost) throws Exception {
		System.out.println("Connecting to "+ serverhost); 
	}
}
