package me.ajonbin.designpattern.decorator;

public class ConcreteDecoratorAddDressingSalad extends DecoratorSalad{
	public ConcreteDecoratorAddDressingSalad(ComponentSalad salad) {
		super(salad);
	}
	public String addDressing(){
		return " + Italy Dressing";
	}

	@Override
	public String make() {
		return salad.make() + addDressing();
	}
}
