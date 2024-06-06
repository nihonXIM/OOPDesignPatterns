package com.retrain.jdpattern.ZEinterpret.plus;

import java.util.Map;

public class Plus implements Expression {
	Expression leftOperand;
	Expression rightOperand;
	
	public Plus(Expression left, Expression right){
		leftOperand = left;
		rightOperand = right;
	}
	@Override
	public int interpret(Map<String, Expression> variables) { //
		// TODO Auto-generated method stub
		return leftOperand.interpret(variables) + rightOperand.interpret(variables);
	}

}
