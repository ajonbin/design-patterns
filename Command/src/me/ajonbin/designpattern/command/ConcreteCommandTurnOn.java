package me.ajonbin.designpattern.command;

public class ConcreteCommandTurnOn implements Command {
	private ReceiverLight light;

	public ConcreteCommandTurnOn(ReceiverLight light){
		this.light = light;
	}

	@Override
	public void Exceute() {
		light.turnOn();
	}
}
