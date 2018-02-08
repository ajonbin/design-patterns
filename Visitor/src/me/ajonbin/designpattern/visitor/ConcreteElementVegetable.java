package me.ajonbin.designpattern.visitor;

public class ConcreteElementVegetable implements ElementIngredient {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
