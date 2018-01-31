package me.ajonbin.designpattern.factory;

public class FactoryExample {
	public static void main(String[] args){
		ObjectVegetableSalad broccoliSalad = FactoryVegetableSalad.getSalad(VegetableSaladType.BROCCOLI);
		broccoliSalad.makeSalad();

		ObjectVegetableSalad cucumberSalad = FactoryVegetableSalad.getSalad(VegetableSaladType.THAI_CUCUMBER);
		cucumberSalad.makeSalad();
	}
}
