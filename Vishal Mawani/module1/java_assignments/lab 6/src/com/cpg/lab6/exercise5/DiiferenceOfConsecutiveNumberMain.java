package com.cpg.lab6.exercise5;

import java.util.Scanner;

public class DiiferenceOfConsecutiveNumberMain {

	public static void main(String[] args) {int number1;
	System.out.println("Enter Number");
	Scanner sc = new Scanner(System.in);
	
	number1 = sc.nextInt();
	sc.close();
	DiiferenceOfConsecutiveNumber obj = new DiiferenceOfConsecutiveNumber();
	
	System.out.println(obj.modifyNumber(number1));// TODO Auto-generated method stub

	}

}
