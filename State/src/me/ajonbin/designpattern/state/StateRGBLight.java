package me.ajonbin.designpattern.state;

public abstract class StateRGBLight {
	protected RGBLight light;

	public StateRGBLight(RGBLight light){
		this.light = light;
	}

	public abstract void handle();
}
