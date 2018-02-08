package me.ajonbin.designpattern.visitor;

public class ConcreteElementDressing implements ElementIngredient {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}