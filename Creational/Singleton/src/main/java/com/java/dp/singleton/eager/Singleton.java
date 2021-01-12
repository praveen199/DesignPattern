package com.java.dp.singleton.eager;

/*
 * Method 3: Eager Instantiation 
 * Static initializer based Java implementation of singleton design pattern
 */
public class Singleton {

	private static Singleton obj = new Singleton();
    private Singleton() {}
    
    public static Singleton getInstance() {
        return obj;
    }
}
