package me.ajonbin.designpattern.observer;

public class ConcreteObserverPhone extends Observer{
	public ConcreteObserverPhone(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("Observed on Phone: " + subject.getState());
	}
}
