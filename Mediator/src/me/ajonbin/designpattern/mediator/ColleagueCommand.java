package me.ajonbin.designpattern.mediator;

public  abstract class ColleagueCommand {
	protected MediatorCommandReceiver mediator;

	public ColleagueCommand(MediatorCommandReceiver mediator){
		this.mediator = mediator;
	}
	public abstract void execute();
}
