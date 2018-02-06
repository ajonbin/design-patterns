package me.ajonbin.designpattern.interpret;

public class NonTerminalExpressionAnd implements AbstractExpression4Recipe{
	private AbstractExpression4Recipe expression1;
	private AbstractExpression4Recipe expression2;

	public NonTerminalExpressionAnd(AbstractExpression4Recipe exp1,AbstractExpression4Recipe exp2){
		this.expression1 = exp1;
		this.expression2 = exp2;
	}
	@Override
	public boolean interpret(String contextRecipe) {
		return expression1.interpret(contextRecipe) && expression2.interpret(contextRecipe);
	}
}
