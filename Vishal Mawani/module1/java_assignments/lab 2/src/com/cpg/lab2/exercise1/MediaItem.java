package com.cpg.lab2.exercise1;

public abstract class MediaItem extends Item {
	
	private int runTime=2;
	
	public MediaItem(int identificationNumber, int numberOfCopies, String title) {
		super(identificationNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}
	public MediaItem() {
		
	}
	
	
	 public int getRunTime() {
		return runTime;
	}



	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}



	void print() {
		super.print();
		System.out.println("Run Time:" + runTime);
	}

}
