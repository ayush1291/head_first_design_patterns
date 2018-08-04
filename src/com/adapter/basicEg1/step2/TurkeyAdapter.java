package com.adapter.basicEg1.step2;

import com.adapter.basicEg1.step1.Duck;
import com.adapter.basicEg1.step1.Turkey;

public class TurkeyAdapter implements Duck{ //implements the target interface

	Turkey turkey; //"composes" the adaptee
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey= turkey;
	}
	
	
	@Override
	public void fly() {
		turkey.flyShort();
		
	}

	@Override
	public void quack() {
		turkey.makeNoise();
		
	} 

}
