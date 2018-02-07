package me.ajonbin.designpattern.state;

public class ConcreteStateG extends StateRGBLight{
	public ConcreteStateG(RGBLight light) {
		super(light);
	}

	@Override
	public void handle() {
		System.out.println("Change Light to Blue");
		light.setState(light.getStateB());
	}
}