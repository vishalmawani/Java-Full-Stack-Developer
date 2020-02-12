package com.cpg.lab2.exercise1;

public class Video extends MediaItem {
	
	private String director = "sanjayleelabhansali";
	private String genre = "action";
	private int yearReleased = 1999;
	
	public Video(int identificationNumber, int numberOfCopies, String title) {
		super(identificationNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	
	public Video() {
		
	}
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	void print() {
		super.print();
		System.out.println("Director:" + director);
		System.out.println("Genre:" + genre);
		System.out.println("Year Of Release:" + yearReleased);
	}

}
