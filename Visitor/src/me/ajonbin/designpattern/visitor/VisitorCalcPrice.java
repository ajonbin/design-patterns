package me.ajonbin.designpattern.visitor;

public class VisitorCalcPrice implements Visitor{
	double totalPrice = 0;
	@Override
	public void visit(ConcreteElementCondiment condiment) {
		System.out.println("Add $0.1 for condiment");
		totalPrice += 0.1;
	}

	@Override
	public void visit(ConcreteElementDressing dressing) {
		System.out.println("Add $0.5 for dressing");
		totalPrice += 0.5;
	}

	@Override
	public void visit(ConcreteElementMeat meat) {
		System.out.println("Add $3 for meat");
		totalPrice += 3;
	}

	@Override
	public void visit(ConcreteElementVegetable vegetable) {
		System.out.println("Add $2.5 for vegetable");
		totalPrice += 2.5;
	}

	@Override
	public void visit(MealOrder mealOrder) {
		if(mealOrder.getIngredients().size() > 5){
			System.out.println("Minus $1 for more than 5 items");
			totalPrice -= 1;
		}
		System.out.println("Total Price is " + totalPrice);
	}
}
