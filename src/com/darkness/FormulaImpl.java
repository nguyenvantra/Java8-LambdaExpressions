package com.darkness;

public class FormulaImpl implements Formula {

	@Override
	public double calculate(int a) {
		return a * a - a;
	}

}
