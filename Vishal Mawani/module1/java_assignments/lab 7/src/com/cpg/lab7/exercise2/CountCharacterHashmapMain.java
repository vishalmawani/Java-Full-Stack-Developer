package com.cpg.lab7.exercise2;

import java.util.Scanner;

public class CountCharacterHashmapMain {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char[] array = sc.next().toCharArray();
	
	CountCharacterHashmap obj = new CountCharacterHashmap();
	System.out.println(obj.countCharacter(array));
	sc.close();
	}

}
