package com.cpg.lab2.exercise1;

public abstract class WrittenItem extends Item {
	
	private String author = "Vishal";

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WrittenItem(int identificationNumber, int numberOfCopies, String title, String author) {
		super(identificationNumber, numberOfCopies, title);
		this.author = author;
	}
	
	public WrittenItem() {
		
	}
	void print() {
		super.print();
		System.out.println("Author:"+ author);
	}
	

}
