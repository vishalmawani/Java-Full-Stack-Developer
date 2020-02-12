package com.cpg.lab2.exercise1;

import java.util.Scanner;

public class LibraryMain {
   
	Scanner sc = new Scanner(System.in);
	
	void getInputData() {
		
		System.out.println("Welcome to Library Management System...");
		System.out.println("1. Check-In     2.  Check-Out");
		int choice1 = sc.nextInt();
		
		
	}
	public static void main(String[] args) {
		Book obj = new Book();
		obj.print();
		
	}

}
