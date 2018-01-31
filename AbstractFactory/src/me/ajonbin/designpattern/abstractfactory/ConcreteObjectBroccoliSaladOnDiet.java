package me.ajonbin.designpattern.abstractfactory;

public class ConcreteObjectBroccoliSaladOnDiet extends ObjectVegetableSalad {
	@Override
	public void makeSalad() {
		System.out.println("2 heads fresh broccoli with no condiments");
	}
}
