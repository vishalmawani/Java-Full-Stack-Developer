package com.cpg.lab2.exercise1;

public abstract class Item {
	
	private int identificationNumber=123;
	private int numberOfCopies=10;
	private String title="java";
	
	//Getters and Setters...
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Constructor...
	public Item() {
		
	}
	
	public Item(int identificationNumber, int numberOfCopies, String title) {
		super();
		this.identificationNumber = identificationNumber;
		this.numberOfCopies = numberOfCopies;
		this.title = title;
	}
	
	
	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", numberOfCopies=" + numberOfCopies + ", title="
				+ title + "]";
	}
	
	
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificationNumber != other.identificationNumber)
			return false;
		if (numberOfCopies != other.numberOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	void checkIn() {
		
	}
	
	void checkOut() {
		
	}
	
	void print() {
		System.out.println("Identification Number:" + identificationNumber);
		System.out.println("Number of Copies:" + numberOfCopies);
		System.out.println("Title:" + title);
		
	}
	
	
	

}
