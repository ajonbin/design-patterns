package me.ajonbin.designpattern.command;

public class CommandExample {
	public static void main(String[] args){
		commandClient();
	}

	public static void commandClient(){
		ReceiverLight lightInBedroom = new ReceiverLight("BedRoom",true);
		ReceiverLight lightInSittingRoom = new ReceiverLight("SittingRoom",false);


		ConcreteCommandTurnOn cmdBedroomOn = new ConcreteCommandTurnOn(lightInBedroom);
		ConcreteCommandTurnOn cmdSittingRoomOn = new ConcreteCommandTurnOn(lightInSittingRoom);

		ConcreteCommandTurnAllOff cmdTurnAllOff = new ConcreteCommandTurnAllOff();
		cmdTurnAllOff.addLight(lightInBedroom);
		cmdTurnAllOff.addLight(lightInSittingRoom);

		ConcreteCommandToggleAll cmdToggleAll = new ConcreteCommandToggleAll();

		cmdToggleAll.addLight(lightInBedroom);
		cmdToggleAll.addLight(lightInSittingRoom);
		InvokerLightSwitch invokerLightSwitch = new InvokerLightSwitch();


		System.out.println("==== Toggle Light ====");
		invokerLightSwitch.executeCommand(cmdToggleAll);
		invokerLightSwitch.executeCommand(cmdToggleAll);

		System.out.println("==== Turn On Light ====");
		invokerLightSwitch.executeCommand(cmdBedroomOn);
		invokerLightSwitch.executeCommand(cmdSittingRoomOn);



		System.out.println("==== Turn Off Light ====");
		invokerLightSwitch.executeCommand(cmdTurnAllOff);


	}
}
