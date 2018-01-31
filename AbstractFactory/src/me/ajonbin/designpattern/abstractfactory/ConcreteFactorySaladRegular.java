package me.ajonbin.designpattern.abstractfactory;

public class ConcreteFactorySaladRegular extends AbstractFactorySalad {
	@Override
	public ObjectVegetableSalad getSalad(VegetableSaladType saladType) {
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
