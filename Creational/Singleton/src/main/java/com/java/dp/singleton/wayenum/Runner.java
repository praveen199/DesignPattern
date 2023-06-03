package com.java.dp.singleton.wayenum;

public class Runner {

	public static void main(String[] args) {

		Singleton s = Singleton.INSTANCE;
		s.i = 5;
		s.show();
		
		Singleton obj = Singleton.INSTANCE;
		obj.i = 6;
		obj.show();
	}
}
