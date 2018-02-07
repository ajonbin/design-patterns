package me.ajonbin.designpattern.observer;

public abstract class Observer {
	protected Subject subject;

	public Observer(Subject subject){
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	public abstract void update();
}
