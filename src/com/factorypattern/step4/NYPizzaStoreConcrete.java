package com.factorypattern.step4;

//Base class Pizza Store has no idea what kind of pizzas are getting created here

public class NYPizzaStoreConcrete extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
//		if (item.equals(“cheese”)) {
//			return new NYStyleCheesePizza();
//			} else if (item.equals(“veggie”)) {
//			return new NYStyleVeggiePizza();
//			} else if (item.equals(“clam”)) {
//			return new NYStyleClamPizza();
//			} else if (item.equals(“pepperoni”)) {
//			return new NYStylePepperoniPizza();
//			} else return null;
		return null;
	}
	
	

	
}
