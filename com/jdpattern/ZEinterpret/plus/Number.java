package com.retrain.jdpattern.ZEinterpret.plus;

import java.util.Map;

public class Number implements Expression {
	private int number;
	public Number(int number){this.number = number;}
	@Override
	public int interpret(Map<String, Expression> variables) {
		// TODO Auto-generated method stub
		return number;
	}
}