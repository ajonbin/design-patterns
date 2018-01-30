package me.ajonbin.designpattern.flyweight;

public class FlyweightExample {

	public static void main(String[] args){
		ClientOrderSystem orderSystem = new ClientOrderSystem();

		orderSystem.takeOrder("Design Pattern");
		orderSystem.takeOrder("Linear Algebra");
		orderSystem.takeOrder("Linear Algebra");
		orderSystem.takeOrder("Effective Java");
		orderSystem.takeOrder("Effective Python");
		orderSystem.takeOrder("Effective Java");
		orderSystem.takeOrder("Design Pattern");
		orderSystem.takeOrder("Effective Python");
		orderSystem.takeOrder("Linear Algebra");
		orderSystem.takeOrder("Effective Java");
		orderSystem.takeOrder("Effective Python");
		orderSystem.takeOrder("Effective Java");
		orderSystem.takeOrder("Design Pattern");
		orderSystem.takeOrder("Effective Python");

		orderSystem.processOrders();
	}
}
