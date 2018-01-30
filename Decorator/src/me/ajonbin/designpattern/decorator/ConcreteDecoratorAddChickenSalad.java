package me.ajonbin.designpattern.decorator;

public class ConcreteDecoratorAddChickenSalad extends DecoratorSalad {
	public ConcreteDecoratorAddChickenSalad(ComponentSalad salad) {
		super(salad);
	}
	public String addChicken(){
		return " + Chicken";
	}

	@Override
	public String make() {
		return salad.make() + addChicken();
	}
}
