package me.ajonbin.designpattern.chainofresponsibility;


public class ChainOfResponsibilityExample {
	public static void main(String[] args){
		chainOfResponsibilityCline();
	}

	public static void chainOfResponsibilityCline(){
		ConcreteHandlerChef Mike = new ConcreteHandlerChef();
		ConcreteHandlerLineCook John = new ConcreteHandlerLineCook();
		ConcreteHandlerDishWasher Sean = new ConcreteHandlerDishWasher();

		John.setSuccessor(Mike);
		Sean.setSuccessor(John);

		System.out.println("==== Wash Dishes ====");
		Sean.handleRequest(KitchenRequest.WASH_DISHES);
		System.out.println("=====================\n");

		System.out.println("==== Make a Dish ====");
		Sean.handleRequest(KitchenRequest.MAKE_A_DISH);
		System.out.println("=====================\n");

		System.out.println("==== Develop a Dish ====");
		Sean.handleRequest(KitchenRequest.DEVELOP_A_DISH);
		System.out.println("========================");

	}
}
