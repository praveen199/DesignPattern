package com.java.dp.builder;

public class Test {

	public static void main(String[] args) {
		//Phone p = new Phone(4,"6.9", "48", "7000", "p4");
		
		Phone p = new PhoneBuilder().setRam(6).setProcessor("p4").setCamera("48").getPhone();
		System.out.println(p);
	}

}
