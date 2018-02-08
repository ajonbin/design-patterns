package me.ajonbin.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class MealOrder implements ElementIngredient {
	private List<ElementIngredient> ingredients = new ArrayList<ElementIngredient>();

	public List<ElementIngredient> getIngredients() {
		return ingredients;
	}

	public void addIngredient(ElementIngredient ingredient){
		ingredients.add(ingredient);
	}

	@Override
	public void accept(Visitor visitor) {
		for(ElementIngredient ingredient:ingredients){
			ingredient.accept(visitor);
		}
		visitor.visit(this);
	}
}
