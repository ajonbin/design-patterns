package me.ajonbin.designpattern.interpret;

import java.util.StringTokenizer;

public class TeminalExpressionHasIngredient implements AbstractExpression4Recipe{
	private String ingredient;

	public TeminalExpressionHasIngredient(String ingredient){
		this.ingredient = ingredient;
	}

	@Override
	public boolean interpret(String contextRecipe) {
		StringTokenizer stringTokenizer = new StringTokenizer(contextRecipe);
		while (stringTokenizer.hasMoreTokens()){
			String nextToken = stringTokenizer.nextToken();
			if(nextToken.equals(ingredient)){
				return true;
			}
		}
		return false;
	}
}
