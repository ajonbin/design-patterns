package me.ajonbin.designpattern.state;


public class ConcreteStateR extends StateRGBLight{
	public ConcreteStateR(RGBLight light) {
		super(light);
	}

	@Override
	public void handle() {
		System.out.println("Change Light to Green");
		light.setState(light.getStateG());
	}
}
