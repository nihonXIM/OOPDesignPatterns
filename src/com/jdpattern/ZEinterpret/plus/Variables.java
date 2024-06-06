package com.jdpattern.ZEinterpret.plus;

import java.util.Map;

public class Variables implements Expression {
	String name;
	public Variables(String name){this.name = name;}
	@Override
	public int interpret(Map<String, Expression> variables) {
		// TODO Auto-generated method stub
		if(null == variables.get(name)) return 0;
		return variables.get(name).interpret(variables);
		
		
	}
}
