package com.UserInputRunner;

import java.util.Scanner;

public class UserInputRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The number entered is : " + num);

		System.out.print("Enter a character: ");
		String s = sc.next();
		System.out.println("The number entered is : " + s);

	}

}
