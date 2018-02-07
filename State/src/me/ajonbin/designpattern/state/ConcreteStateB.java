package me.ajonbin.designpattern.state;

public class ConcreteStateB extends StateRGBLight{
	public ConcreteStateB(RGBLight light) {
		super(light);
	}

	@Override
	public void handle() {
		System.out.println("Change Light to Off");
		light.setState(light.getStateOff());
	}
}