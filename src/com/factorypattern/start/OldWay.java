package com.factorypattern.start;

public class OldWay {
	
	
	public Pizza orderPizza(String type){
		
		Pizza pizza=null;
		
//*************** Problem*************This is the thing which is varying if new pizzas are added
		if(type.equalsIgnoreCase("cheese")) pizza = new CheesePizza();
		//else if -- other types of pizzas
		
		//Other Methods
//		pizza.prepare();
//		pizza.bake();
		
		return pizza;
	}

}
