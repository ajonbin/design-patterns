package me.ajonbin.designpattern.strategy;

public class ContextPassword {
	private String password;
	private StrategyPasswordValidator strategy;

	public ContextPassword(String password, StrategyPasswordValidator strategy) {
		this.password = password;
		this.strategy = strategy;
	}

	public boolean requestIsValid(){
		return strategy.executeIsValid(this);
	}

	public String getPassword() {
		return password;
	}
}
