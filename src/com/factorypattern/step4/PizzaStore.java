package com.factorypattern.step4;

public abstract class PizzaStore {
//	Now createPizza is back to being a call to a method in the PizzaStore
//	rather than on a factory object.
//	and each subclass is going to make the decision about
//	what makes up a pizza.
	
//	So, this resolves prob in step 3 to couple the creation and post steps
	
//	Ref 4.jpg
	
//	Also, concrete classes will be in subclasses, not here
//	So, pizza creation  and orderpizza are decoupled as this is abstract method and has no idea about concrete classes
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
//		pizza.prepare();
//		pizza.bake();
//		pizza.cut();
//		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);

}
