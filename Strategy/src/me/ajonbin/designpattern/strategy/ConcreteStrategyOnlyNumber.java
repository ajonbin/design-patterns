package me.ajonbin.designpattern.strategy;

public class ConcreteStrategyOnlyNumber extends StrategyPasswordValidator{
	@Override
	public boolean executeIsValid(ContextPassword password) {
		return password.getPassword().matches("[0-9]+") && password.getPassword().length() >= 6;
	}
}
