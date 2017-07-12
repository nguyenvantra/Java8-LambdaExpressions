package com.darkness;

public class FormulaTest {
	public static void main(String[] args) {
		Formula formula = new FormulaImpl();
		
		System.out.println(formula.calculate(25));
		System.out.println(formula.sqrt(25));
	}
}
