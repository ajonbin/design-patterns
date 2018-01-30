package me.ajonbin.designpattern.decorator;

public abstract class DecoratorSalad extends ComponentSalad{

	protected ComponentSalad salad;
	public DecoratorSalad(ComponentSalad salad){
		this.salad = salad;
	}

	@Override
	public String make() {
		return salad.make();
	}
}
