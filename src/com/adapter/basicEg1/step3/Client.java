package com.adapter.basicEg1.step3;

import com.adapter.basicEg1.step1.Duck;
import com.adapter.basicEg1.step1.MyDuck;
import com.adapter.basicEg1.step1.MyTurkey;
import com.adapter.basicEg1.step1.Turkey;
import com.adapter.basicEg1.step2.TurkeyAdapter;

public class Client {

	public static void main(String[] args){
		
		Duck duck1 = new MyDuck();
		Turkey turkey1 = new MyTurkey();
		
		TurkeyAdapter adoptedTurkey = new TurkeyAdapter(turkey1);
		System.out.println("processDuck for duck1----->");
		processDuck(duck1);
		System.out.println("processDuck for turkey1 via adoptedTurkey----->");
		processDuck(adoptedTurkey);
		
	}
	
	public static void processDuck(Duck duck) {
		duck.fly();
		duck.quack();
	}
}
