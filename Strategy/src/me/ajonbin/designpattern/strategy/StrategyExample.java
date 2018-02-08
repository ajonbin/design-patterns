package me.ajonbin.designpattern.strategy;

public class StrategyExample {
	public static void main(String[] args){
		ContextPassword password1 = new ContextPassword("34567897",new ConcreteStrategyOnlyNumber());
		System.out.println(String.format("Is %s a valid Number Password? %b",password1.getPassword(),password1.requestIsValid()));

		ContextPassword password2 = new ContextPassword("34567897",new ConcreteStrategyMustComplex());
		System.out.println(String.format("Is %s a valid Complex Password? %b",password2.getPassword(),password2.requestIsValid()));

		ContextPassword password3 = new ContextPassword("3A0-4B93",new ConcreteStrategyMustComplex());
		System.out.println(String.format("Is %s a valid Complex Password? %b",password3.getPassword(),password3.requestIsValid()));

		ContextPassword password4 = new ContextPassword("3A0b_B93",new ConcreteStrategyMustComplex());
		System.out.println(String.format("Is %s a valid Complex Password? %b",password4.getPassword(),password4.requestIsValid()));
	}
}
