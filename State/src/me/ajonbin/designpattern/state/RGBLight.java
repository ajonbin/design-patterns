package me.ajonbin.designpattern.state;

public class RGBLight {
	private StateRGBLight stateR;
	private StateRGBLight stateG;
	private StateRGBLight stateB;
	private StateRGBLight stateOff;

	private StateRGBLight currentState;

	public RGBLight(){
		stateR = new ConcreteStateR(this);
		stateG = new ConcreteStateG(this);
		stateB = new ConcreteStateB(this);
		stateOff = new ConcreteStateOff(this);

		currentState = stateOff;

	}

	public void requestPushButton(){
		currentState.handle();
	}

	public void setState(StateRGBLight state){
		currentState = state;
	}

	public StateRGBLight getStateR() {
		return stateR;
	}

	public StateRGBLight getStateG() {
		return stateG;
	}

	public StateRGBLight getStateB() {
		return stateB;
	}

	public StateRGBLight getStateOff() {
		return stateOff;
	}
}
