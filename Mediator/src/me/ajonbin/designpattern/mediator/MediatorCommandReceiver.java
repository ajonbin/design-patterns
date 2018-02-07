package me.ajonbin.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorCommandReceiver {
	private List<Light> lights = new ArrayList<Light>();

	public void addLight(Light light){
		lights.add(light);
	}

	public void turnAllOn(){
		for (Light light:lights) {
			if(!light.isOn()) {
				light.turnOn();
			}
		}
	}

	public void turnAllOff(){
		for (Light light:lights) {
			if(light.isOn()) {
				light.turnOff();
			}
		}
	}

	public void toggleAll(){
		for (Light light:lights) {
			light.toggle();
		}
	}
}
