package com.cpg.lab6.exercise4;

import java.util.Scanner;

public class NextConsonantStringMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = new String();
		str = sc.nextLine();
		char[] arr = str.toCharArray();
		NextConsonantString obj = new NextConsonantString();
		
	System.out.println(obj.alterString(arr));
		

	}

}
