package com.cpg.lab2.exercise1;

public class JournalPaper extends WrittenItem {
	
	private int yearPublished=1999;
	
	public JournalPaper(int identificationNumber, int numberOfCopies, String title, String author) {
		super(identificationNumber, numberOfCopies, title, author);
		// TODO Auto-generated constructor stub
	}
	
	public JournalPaper() {
		
	}
	

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	void print() {
		super.print();
		System.out.println("Year Of Publish:" + yearPublished);
	}
}
