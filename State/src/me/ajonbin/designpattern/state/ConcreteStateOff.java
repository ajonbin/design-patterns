package me.ajonbin.designpattern.state;

public class ConcreteStateOff extends StateRGBLight{
	public ConcreteStateOff(RGBLight light) {
		super(light);
	}

	@Override
	public void handle() {
		System.out.println("Change Light to Red");
		light.setState(light.getStateR());
	}
}