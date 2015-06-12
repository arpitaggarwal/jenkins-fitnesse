package com.fitnesse.fixture;

import com.test.calculator.Calculator;
/**
 * 
 * @author 
 *
 */
public class Division {
	
/**
 * 
 */
	private float numerator;
	private float denominator;
	private float quotient;

	public void setNumerator(float numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(float denominator) {
		this.denominator = denominator;
	}

	public float quotient() {
		Calculator calculator = new Calculator(numerator, denominator);
		this.quotient = calculator.getQuotient();
		return this.quotient;
	}
}
