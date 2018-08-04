package com.adapter.basicEg1.step1;

public class MyTurkey implements Turkey {

	@Override
	public void flyShort() {
		System.out.println("MyTurkey is flying low");
	}

	@Override
	public void makeNoise() {
		System.out.println("MyTurkey is making noise");

	}

}
