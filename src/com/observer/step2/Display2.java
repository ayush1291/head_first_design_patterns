package com.observer.step2;

import com.observer.common.Dsiplay;
import com.observer.common.Observer;
import com.observer.common.Subject;

public class Display2 implements Observer,Dsiplay{
	Subject s2;
	
	public Display2(Subject s2) {
		this.s2=s2;
		s2.addObserver(this);
	}
	
	
	@Override
	public void update(int p1, int p2) {
		System.out.println("Updated display2");
		
	}

	@Override
	public void display() {
		
	}

}
