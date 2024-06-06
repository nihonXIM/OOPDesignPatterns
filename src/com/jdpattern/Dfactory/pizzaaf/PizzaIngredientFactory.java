package com.jdpattern.Dfactory.pizzaaf;

//Abstract Factory
public interface PizzaIngredientFactory {

	//Factory Method
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
