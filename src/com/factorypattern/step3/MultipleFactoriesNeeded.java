package com.factorypattern.step3;


//*************Note franchises want diffrent stypes of pizzas but prepared in same way


public class MultipleFactoriesNeeded {
	
	//**********PRoblem***** As everyone has factory, so they use it to create pizzas but not follow other steps
	// like packing etc --  as we have given them freedom by sharing pizza factory
	
//	Rethinking the problem a bit, you see that what you’d really like to do is create a framework that ties the store and the
//	pizza creation together, yet still allows things to remain
//	ﬂexible.
	
//	In our early code, before the SimplePizzaFactory, we had
//	the pizza-making code tied to the PizzaStore, but it wasn’t
//	ﬂexible. 
	
	public static void main(String[] args) {
		
		//*************Store 1**************
//		NYPizzaFactory nyFactory = new NYPizzaFactory();
//		PizzaStore nyStore = new PizzaStore(nyFactory);
//		nyStore.order(“Veggie”);
		
		//**********Store 2**************
//		ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
//		PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
//		chicagoStore.order(“Veggie”);
	}

}
