package me.ajonbin.designpattern.command;

public class ReceiverLight {
	private boolean isOn = false;
	private String name;

	public ReceiverLight(String name, boolean isOn){
		this.name = name;
		this.isOn = isOn;
	}

	public void turnOn(){
		System.out.println(name + " is Turned ON");
		isOn = true;
	}

	public void turnOff(){
		System.out.println(name + " is Turned OFF");
		isOn = false;
	}

	public void toggle(){
		if(isOn){
			System.out.println(name + " will be turned off");
			turnOff();
		}else{
			System.out.println(name + " will be turned on");
			turnOn();
		}
	}
}
