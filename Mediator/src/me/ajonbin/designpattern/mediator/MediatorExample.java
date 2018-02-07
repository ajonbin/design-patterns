package me.ajonbin.designpattern.mediator;

public class MediatorExample {
	public static void main(String[] args){
		Light lightInBedroom = new Light("BedRoom",true);
		Light lightInSittingRoom = new Light("SittingRoom",false);

		MediatorCommandReceiver mediator = new MediatorCommandReceiver();
		mediator.addLight(lightInBedroom);
		mediator.addLight(lightInSittingRoom);

		ConcreteColleagueCommandToggle cmdToggle = new ConcreteColleagueCommandToggle(mediator);
		ConcreteColleagueCommandTurnOn cmdOn = new ConcreteColleagueCommandTurnOn(mediator);
		ConcreteColleagueCommandTurnOff cmdOff = new ConcreteColleagueCommandTurnOff(mediator);

		cmdToggle.execute();
		cmdOn.execute();
		cmdOff.execute();
	}
}
