package me.ajonbin.designpattern.observer;

public class ConcreteObserverTablet extends Observer{
	public ConcreteObserverTablet(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("Observed on Tablet: " + subject.getState());
	}
}
