package com.cpg.lab2.exercise1;

public class Book extends WrittenItem {

	public Book(int identificationNumber, int numberOfCopies, String title, String author) {
		super(identificationNumber, numberOfCopies, title, author);
		// TODO Auto-generated constructor stub
	}

	 public Book() {
		 
	 }
	 
	void print() {
		super.print();
	}
}
