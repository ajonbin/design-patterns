package me.ajonbin.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	protected List<Observer> observers = new ArrayList<Observer>();

	public void notifyObserver(){
		for (Observer observer: observers) {
			observer.update();
		}
	}

	public void registerObserver(Observer observer){
		observers.add(observer);
	}

	public abstract String getState();
	public abstract void setState(String state);

}
