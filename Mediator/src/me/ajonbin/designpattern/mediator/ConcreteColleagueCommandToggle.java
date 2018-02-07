package me.ajonbin.designpattern.mediator;

public class ConcreteColleagueCommandToggle extends ColleagueCommand{

	public ConcreteColleagueCommandToggle(MediatorCommandReceiver mediator) {
		super(mediator);
	}

	@Override
	public void execute() {
		mediator.toggleAll();
	}
}
