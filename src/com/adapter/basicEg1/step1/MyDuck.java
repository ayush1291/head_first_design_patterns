package com.adapter.basicEg1.step1;

public class MyDuck implements Duck{

	@Override
	public void fly() {
		System.out.println("MyDuck is flying high");
		
	}

	@Override
	public void quack() {
		System.out.println("MyDuck is quacking");
		
	}

}
