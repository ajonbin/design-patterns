package me.ajonbin.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCommandToggleAll implements Command{
	private List<ReceiverLight> lights = new ArrayList<ReceiverLight>();

	public void addLight(ReceiverLight light){
		lights.add(light);
	}
	@Override
	public void Exceute() {
		for (ReceiverLight light:lights) {
			light.toggle();
		}
	}
}
