package me.ajonbin.designpattern.abstractfactory;

public abstract class AbstractFactorySalad {
	public static AbstractFactorySalad getSaladFactory(boolean isOnDiet){
		if(isOnDiet){
			return new ConcreteFactorySaladOnDiet();
		}else{
			return new ConcreteFactorySaladRegular();
		}
	}

	public abstract ObjectVegetableSalad getSalad(VegetableSaladType saladType);
}
