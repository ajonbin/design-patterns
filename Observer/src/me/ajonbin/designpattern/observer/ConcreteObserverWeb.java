package me.ajonbin.designpattern.observer;

public class ConcreteObserverWeb extends Observer{
	public ConcreteObserverWeb(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("Observed on Web: " + subject.getState());
	}
}
