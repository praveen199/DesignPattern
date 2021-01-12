package com.java.dp.adapter.test;

import com.java.dp.adapter.Sparrow;
import com.java.dp.adapter.target.BirdAdapter;
import com.java.dp.adapter.target.PlasticToyDuck;
import com.java.dp.adapter.target.ToyDuck;

public class Main {

	public static void main(String args[]) {
		Sparrow sparrow = new Sparrow(); 
		sparrow.fly(); 
		sparrow.makeSound(); 
		
		ToyDuck toyDuck = new PlasticToyDuck(); 
		toyDuck.speakUp(); 
		
		ToyDuck birdAdapter = new BirdAdapter(sparrow); 

		System.out.println("BirdAdapter..."); 
		birdAdapter.speakUp(); 
	}
}
