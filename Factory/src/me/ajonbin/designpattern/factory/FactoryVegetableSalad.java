package me.ajonbin.designpattern.factory;

public class FactoryVegetableSalad {
	public static ObjectVegetableSalad getSalad(VegetableSaladType saladType){
		switch (saladType){
			case BROCCOLI:
				return new ConcreteObjectBroccoliSalad();
			case THAI_CUCUMBER:
				return new ConcreteObjectThaiCucumberSalad();
			default:
				return null;
		}
	}
}
