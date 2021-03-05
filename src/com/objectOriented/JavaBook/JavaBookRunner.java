package com.objectOriented.JavaBook;

public class JavaBookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaBook artOfComputerProgram = new JavaBook(1);
		JavaBook effectiveJava = new JavaBook(2);
		JavaBook cleanCode = new JavaBook(3);
		
		System.out.println("Intitally: ");
		System.out.println("No of books of \"Art of Programming\" are: "+ artOfComputerProgram.getNoOfBooks());
		System.out.println("No of books of \"Effective Java\" are: "+ cleanCode.getNoOfBooks());
		System.out.println("No of books of \"Clean Code\" are: "+ effectiveJava.getNoOfBooks() + "\n");
		
		artOfComputerProgram.setNoOfBooks(10);
		effectiveJava.setNoOfBooks(20);
		cleanCode.setNoOfBooks(30);
		
		System.out.println("Newly set");
		System.out.println("No of books of \"Art of Programming\" are: "+ artOfComputerProgram.getNoOfBooks());
		System.out.println("No of books of \"Effective Java\" are: "+ cleanCode.getNoOfBooks());
		System.out.println("No of books of \"Clean Code\" are: "+ effectiveJava.getNoOfBooks()+ "\n");
		
		artOfComputerProgram.increaseNoOfBooks(10);
		effectiveJava.increaseNoOfBooks(20);
		cleanCode.increaseNoOfBooks(20);
		
		System.out.println("Increased Quantity");
		System.out.println("No of books of \"Art of Programming\" are: "+ artOfComputerProgram.getNoOfBooks());
		System.out.println("No of books of \"Effective Java\" are: "+ cleanCode.getNoOfBooks());
		System.out.println("No of books of \"Clean Code\" are: "+ effectiveJava.getNoOfBooks());
		
	}

}
