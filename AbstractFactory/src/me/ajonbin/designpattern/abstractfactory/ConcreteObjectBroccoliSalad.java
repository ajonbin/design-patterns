package me.ajonbin.designpattern.abstractfactory;

public class ConcreteObjectBroccoliSalad extends ObjectVegetableSalad {
	@Override
	public void makeSalad() {
		System.out.println("2 heads fresh broccoli + 1 red onion + 1/2 pound bacon + 1/2 cup white sugar + 2 tablespoons white wine vinegar");
	}
}
