package me.ajonbin.designpattern.mediator;

public class ConcreteColleagueCommandTurnOff extends ColleagueCommand {
	public ConcreteColleagueCommandTurnOff(MediatorCommandReceiver mediator) {
		super(mediator);
	}

	@Override
	public void execute() {
		mediator.turnAllOff();
	}
}
