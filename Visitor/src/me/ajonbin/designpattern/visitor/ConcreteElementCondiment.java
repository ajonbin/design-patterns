package me.ajonbin.designpattern.visitor;

public class ConcreteElementCondiment implements ElementIngredient {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}