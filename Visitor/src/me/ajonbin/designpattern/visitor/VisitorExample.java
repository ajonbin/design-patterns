package me.ajonbin.designpattern.visitor;

public class VisitorExample {
	public static void main(String[] args){
		MealOrder mealOrder = new MealOrder();
		mealOrder.addIngredient(new ConcreteElementVegetable());
		mealOrder.addIngredient(new ConcreteElementMeat());
		mealOrder.addIngredient(new ConcreteElementVegetable());
		mealOrder.addIngredient(new ConcreteElementCondiment());
		mealOrder.addIngredient(new ConcreteElementDressing());
		mealOrder.addIngredient(new ConcreteElementDressing());

		VisitorCalcPrice visitorCalcPrice = new VisitorCalcPrice();
		mealOrder.accept(visitorCalcPrice);

		VisitorPrintMeal visitorPrintMeal = new VisitorPrintMeal();
		mealOrder.accept(visitorPrintMeal);

	}
}
