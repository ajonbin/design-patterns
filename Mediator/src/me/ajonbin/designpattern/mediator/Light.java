package me.ajonbin.designpattern.mediator;

public class Light {
	private boolean isOn = false;
	private String name;

	public Light(String name, boolean isOn){
		this.name = name;
		this.isOn = isOn;
	}

	public boolean isOn(){
		return isOn;
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
