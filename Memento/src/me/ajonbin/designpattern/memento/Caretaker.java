package me.ajonbin.designpattern.memento;

import java.util.Stack;

public class Caretaker {
	private Stack<MementoCucumberSalad> mementoHistory = new Stack<MementoCucumberSalad>();

	public void save(OriginatorCucumberSalad salad){
		mementoHistory.push(salad.save());
	}

	public void reload(OriginatorCucumberSalad salad){
		salad.reload(mementoHistory.pop());
	}
}
