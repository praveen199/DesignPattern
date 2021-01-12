package com.java.dp.singleton.threadsafe;

/*
 * Method 2: make getInstance() synchronized 
 * Thread Synchronized Java implementation of singleton design pattern
 * Only one thread can execute this at a time
 */
public class Singleton {

	private static Singleton s;
    private Singleton() {}
 
    public static synchronized Singleton getInstance() {
        if (s==null) {
        	s = new Singleton();
        }
        return s;
    }
}
