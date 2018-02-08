package me.ajonbin.designpattern.visitor;

public class ConcreteElementMeat implements ElementIngredient {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}