package com.java.dp.singleton.lazy;

/* 
 * Method 1: Classic Implementation 
 * Singleton object is not created until we need it and call getInstance() method
 * The main problem with above method is that it is not thread safe
 */
public class Singleton {

	private static Singleton s;
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
