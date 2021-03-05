package com.NumberExercise;

public class NumberExercise {
	int num1, num2;

	public NumberExercise(int a, int num2) {
		// TODO Auto-generated constructor stub
		num1 = a;
		this.num2 = num2;
	}
	
	int multiply() {
		int mul = num1 * num2;
		return(mul);
		
	}
	
	int add() {
		int add = num1 + num2;
		return(add);
		
	}
	
	public void doubleNum(){
		this.num1*= 2;
		this.num2*= 2;
		
	}
	
	int getNumber1() {
		return(num1);
	}
	
	int getNumber2() {
		return(this.num2);
	}
	
}
