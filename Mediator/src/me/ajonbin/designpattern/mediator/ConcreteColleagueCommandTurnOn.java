package me.ajonbin.designpattern.mediator;

public class ConcreteColleagueCommandTurnOn extends ColleagueCommand {

	public ConcreteColleagueCommandTurnOn(MediatorCommandReceiver mediator) {
		super(mediator);
	}

	@Override
	public void execute() {
		mediator.turnAllOn();
	}
}
