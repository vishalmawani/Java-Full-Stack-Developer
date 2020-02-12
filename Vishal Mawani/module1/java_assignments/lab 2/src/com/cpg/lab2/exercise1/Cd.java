package com.cpg.lab2.exercise1;

public class Cd extends MediaItem{
	
	private String artist="arijitsingh";
	private String genre="music";
	
	public Cd(int identificationNumber, int numberOfCopies, String title) {
		super(identificationNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}
	public Cd() {
		
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	void print() {
		super.print();
		System.out.println("Artist:" + artist);
		System.out.println("Genre:" + genre);
		
	}

}
