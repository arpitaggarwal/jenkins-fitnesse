package com.fitnesse.fixture;

import com.test.calculator.Calculator;

public class Multiplication {
	
	private float numerator;
	private float denominator;
	private float result;

	public void setNumerator(float numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(float denominator) {
		this.denominator = denominator;
	}

	public float result() {
		Calculator calculator = new Calculator(numerator, denominator);
		this.result = calculator.getResult();
		return this.result;
	}
}
