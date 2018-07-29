package com.factorypattern.step2;

import com.factorypattern.start.CheesePizza;
import com.factorypattern.start.Pizza;

public class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	//*******************Note**********Notice that we’ve replaced the new operator with a create method on the
//	factory object. No more concrete instantiations here! - SO, we coded to interface
	public Pizza orderPizza(String type){
		Pizza pizza=null;
		pizza = factory.createPizza(type);  //*****************Problem in start approach resolved
		
		// pizza.prepare();
		// pizza.bake();
	return pizza;
	}
}
