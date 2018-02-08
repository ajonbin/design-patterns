package me.ajonbin.designpattern.visitor;

public class VisitorPrintMeal implements Visitor{
	private int countCondiment = 0;
	private int countDressing = 0;
	private int countMeat = 0;
	private int countVegetable = 0;
	@Override
	public void visit(ConcreteElementCondiment condiment) {
		countCondiment++;
	}

	@Override
	public void visit(ConcreteElementDressing dressing) {
		countDressing++;
	}

	@Override
	public void visit(ConcreteElementMeat meat) {
		countMeat++;
	}

	@Override
	public void visit(ConcreteElementVegetable vegetable) {
		countVegetable++;
	}

	@Override
	public void visit(MealOrder mealOrder) {
		System.out.println(String.format("The meal is made of %d Meat, %d Vegetable, %d condiment, %d dressing",
			countMeat,countVegetable,countCondiment,countDressing));
	}
}
