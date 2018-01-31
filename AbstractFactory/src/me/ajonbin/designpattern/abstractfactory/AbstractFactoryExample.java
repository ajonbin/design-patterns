package me.ajonbin.designpattern.abstractfactory;

public class AbstractFactoryExample {
	public static void main(String[] args){
		AbstractFactorySalad concreteFactoryOndiet = AbstractFactorySalad.getSaladFactory(true);
		ObjectVegetableSalad cumumberSaladOnDiet = concreteFactoryOndiet.getSalad(VegetableSaladType.THAI_CUCUMBER);
		cumumberSaladOnDiet.makeSalad();


		AbstractFactorySalad concreteFactory = AbstractFactorySalad.getSaladFactory(false);
		ObjectVegetableSalad broccoliSalad = concreteFactory.getSalad(VegetableSaladType.BROCCOLI);
		broccoliSalad.makeSalad();
	}
}
