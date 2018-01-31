package me.ajonbin.designpattern.abstractfactory;

public class ConcreteFactorySaladOnDiet extends AbstractFactorySalad {

	@Override
	public ObjectVegetableSalad getSalad(VegetableSaladType saladType) {
		switch (saladType){
			case BROCCOLI:
				return new ConcreteObjectBroccoliSaladOnDiet();
			case THAI_CUCUMBER:
				return new ConcreteObjectThaiCucumberSaladOnDiet();
			default:
				return null;
		}	}
}
