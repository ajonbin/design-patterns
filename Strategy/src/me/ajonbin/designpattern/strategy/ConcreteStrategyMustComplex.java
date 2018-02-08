package me.ajonbin.designpattern.strategy;

public class ConcreteStrategyMustComplex extends StrategyPasswordValidator{
	@Override
	public boolean executeIsValid(ContextPassword password) {
		return password.getPassword().length() >= 8 &&
						password.getPassword().matches(".*[0-9]+.*") &&
						password.getPassword().matches(".*[a-z]+.*") &&
						password.getPassword().matches(".*[A-Z]+.*") &&
						password.getPassword().matches(".*[!|@|#|$|%|&|*|_|+]+.*");
	}
}
