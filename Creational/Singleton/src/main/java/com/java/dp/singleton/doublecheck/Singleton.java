package com.java.dp.singleton.doublecheck;

/*
 * Method 4 (Best): Double Checked Locking
 */
public class Singleton {

	private static volatile Singleton obj  = null;
	private Singleton() {}

	public static Singleton getInstance() {
		if (obj == null){
			synchronized (Singleton.class) {
				if (obj==null) {
					obj = new Singleton();
				}
			}
		}
		return obj;
	}
}
