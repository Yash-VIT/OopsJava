package com.objectOriented.Moterbike;

public class Moterbike {
	
	private int speed;
	
	Moterbike(int speed){
		this.speed = speed;
	}
	

	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}




	void start() {
		System.out.println("Bike Started");
	}
	
}
