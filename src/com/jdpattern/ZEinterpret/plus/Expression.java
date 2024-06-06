package com.jdpattern.ZEinterpret.plus;

import java.util.Map;

public interface Expression {
	public int interpret(Map<String, Expression> variables);
}
