package com.cpg.lab7.exercise3;

import java.util.Scanner;

public class SquaresOfNumberHashMapMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size=sc.nextInt();
		int[] array = new int[size];
		for(int index =0;index<size;++index)
			array[index]=sc.nextInt();
		SquaresOfNumberHashMap obj = new SquaresOfNumberHashMap();
		System.out.println(obj.getSquares(array));

	}

}
