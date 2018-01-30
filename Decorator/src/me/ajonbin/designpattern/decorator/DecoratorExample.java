package me.ajonbin.designpattern.decorator;

public class DecoratorExample {
	public static void DecoratorClient(){

		ConcreteComponentVegetableSalad vegetableSalad = new ConcreteComponentVegetableSalad();

		System.out.println(vegetableSalad.make());

		ConcreteDecoratorAddChickenSalad chickenSalad = new ConcreteDecoratorAddChickenSalad(vegetableSalad);
		ConcreteDecoratorAddDressingSalad dressingSalad = new ConcreteDecoratorAddDressingSalad(chickenSalad);

		System.out.println(dressingSalad.make());

	}
	public static void main(String[] args){
		DecoratorClient();
	}
}
