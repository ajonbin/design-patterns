package me.ajonbin.designpattern.visitor;

public interface Visitor {
	void visit(ConcreteElementCondiment condiment);
	void visit(ConcreteElementDressing dressing);
	void visit(ConcreteElementMeat meat);
	void visit(ConcreteElementVegetable vegetable);
	void visit(MealOrder mealOrder);
}
