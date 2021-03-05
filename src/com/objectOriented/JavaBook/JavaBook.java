package com.objectOriented.JavaBook;

public class JavaBook {
	
	private int noOfBooks;
	
	JavaBook(int noOfBooks){
		this.noOfBooks = noOfBooks;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	
	public void increaseNoOfBooks(int howMuch) {
		this.noOfBooks += howMuch;
	}

}
