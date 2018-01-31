package me.ajonbin.designpattern.abstractfactory;

public class ConcreteObjectThaiCucumberSalad extends ObjectVegetableSalad {
	@Override
	public void makeSalad() {
		System.out.println("3 large cucumbers + 1 tablespoon salt + 1/2 cup white sugar + 2 jalapeno peppers + 1/4 cup chopped cilantro");
	}
}
