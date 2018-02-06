package me.ajonbin.designpattern.interpret;

public class InterpretExample {
	public static void main(String[] args){
		interpretClient();
	}
	public static void interpretClient(){

		// Sugar && (Onion || (Bean && Cucumber))
		AbstractExpression4Recipe interpretTree = buildInterpretTree();

		String recipe;

		recipe = "1 ouncce bean + 1 pepper + 2 tablespoon sugar";
		System.out.println(recipe + " is " + interpretTree.interpret(recipe));

		recipe = "1 ouncce bean + 1 onion + 2 tablespoon sugar";
		System.out.println(recipe + " is " + interpretTree.interpret(recipe));

		recipe = "1 ouncce bean + 1 cucumber + 2 tablespoon salt";
		System.out.println(recipe + " is " + interpretTree.interpret(recipe));


	}

	public static AbstractExpression4Recipe buildInterpretTree(){
		TeminalExpressionHasIngredient expCucumber = new TeminalExpressionHasIngredient("cucumber");
		TeminalExpressionHasIngredient expBean = new TeminalExpressionHasIngredient("bean");
		TeminalExpressionHasIngredient expOnion = new TeminalExpressionHasIngredient("onion");
		TeminalExpressionHasIngredient expSugar = new TeminalExpressionHasIngredient("sugar");

		NonTerminalExpressionAnd expBeanAndCucumber = new NonTerminalExpressionAnd(expBean,expCucumber);
		NonTerminalExpressionOr  expOnionOr = new NonTerminalExpressionOr(expOnion,expBeanAndCucumber);

		return new NonTerminalExpressionAnd(expSugar, expOnionOr);
	}
}
