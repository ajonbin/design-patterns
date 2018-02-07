package me.ajonbin.designpattern.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConcreteSubjectTwitterMessage extends Subject{
	private Deque<String> messages = new ArrayDeque<String>();

	@Override
	public String getState() {
		return messages.getLast();
	}

	@Override
	public void setState(String state) {
		messages.add(state);
		notifyObserver();
	}

	public void twitter(String message){
		setState(message);
	}
}
