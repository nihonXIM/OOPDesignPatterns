package com.retrain.jdpattern.ZEinterpret.plus;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {
	public Expression syntaxTree;

	public Evaluator(String expression)
	{
		Stack<Expression> expressionStack = new Stack<Expression>();
		for(String token : expression.split(" ")){
			if(token.equals("+")){
				Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
				expressionStack.push(subExpression);
			}else if(token.equals("-")){ //wxy -+
				Expression subExpression = new Minus(expressionStack.pop(), expressionStack.pop());
				expressionStack.push(subExpression);				
			}else{ 
				expressionStack.push(new Variables(token)); 
			}
		}
		syntaxTree = expressionStack.pop();
	}
	
	
	@Override
	public int interpret(Map<String, Expression> context) {
		// TODO Auto-generated method stub
		return syntaxTree.interpret(context);
	}

}
