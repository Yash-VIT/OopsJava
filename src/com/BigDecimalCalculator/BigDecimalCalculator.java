package com.BigDecimalCalculator;

import java.math.BigDecimal;

public class BigDecimalCalculator {
	
	BigDecimal principal;
	BigDecimal rate;
	BigDecimal time;

	public BigDecimalCalculator(String principal, String rate) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal);
		this.rate = new BigDecimal(rate);
		this.rate = this.rate.divide(new BigDecimal(100));
		
	}

	public BigDecimal calculateTotalValue(int i) {
		// TODO Auto-generated method stub
		
		this.time = new BigDecimal(i);
		
		return(principal.add((principal.multiply(rate)).multiply(time)));
	}

	
	

}
