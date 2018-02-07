package me.ajonbin.designpattern.memento;

public class MementoExample {
	public static void main(String[] args){
		Caretaker caretaker = new Caretaker();
		OriginatorCucumberSalad salad = new OriginatorCucumberSalad();

		salad.addCucumber(2);
		salad.addSugar(1);
		salad.addSalt(0.5);

		System.out.print("Initialized: ");

		salad.show();
		caretaker.save(salad);

		salad.addDressing(2);
		salad.addSalt(1);

		System.out.print("Changed: ");
		salad.show();
		caretaker.reload(salad);
		System.out.print("Reloaded: ");
		salad.show();

	}
}
