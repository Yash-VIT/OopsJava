package com.BigDecimalCalculator;

import java.math.BigDecimal;

public class BigDecimalCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimalCalculator calculator = new BigDecimalCalculator("4500.00","7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
		

	}

}
