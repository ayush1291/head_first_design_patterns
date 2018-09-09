package com.observer.step2;

import com.observer.common.Dsiplay;
import com.observer.common.Observer;
import com.observer.common.Subject;

public class Display1 implements Observer,Dsiplay{
	Subject s1;
	
	public Display1(Subject s1) {
		this.s1=s1;
		s1.addObserver(this);
	}
	
	@Override
	public void update(int p1, int p2) {
		System.out.println("Updated display1");
		
	}
	
	
	public void unsubscribe(){
		this.s1.removeObserver(this);
	}

	@Override
	public void display() {
		
	}

}
