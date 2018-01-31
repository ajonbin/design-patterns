package me.ajonbin.designpattern.prototype;

public class PrototypeExample {
	public static void main(String[] args){

		BestSellingItemRegistry registry = new BestSellingItemRegistry();

		PrototypeBook bookForOrder1 = (PrototypeBook)registry.createItem("book");
		PrototypeFood foodForOrder1 = (PrototypeFood)registry.createItem("food");

		PrototypeBook bookForOrder2 = (PrototypeBook)registry.createItem("book");
		PrototypeFood foodForOrder2 = (PrototypeFood)registry.createItem("food");

		System.out.println(bookForOrder1);
		System.out.println(bookForOrder2);
		System.out.println(foodForOrder1);
		System.out.println(foodForOrder2);

		System.out.println(bookForOrder1.hashCode());
		System.out.println(bookForOrder2.hashCode());
		System.out.println(foodForOrder1.hashCode());
		System.out.println(foodForOrder2.hashCode());

	}
}
