package com.objectOriented.Moterbike;

public class MoterbikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Moterbike ducati= new Moterbike(5);
		Moterbike honda= new Moterbike(10);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());

	}

}
