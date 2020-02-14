package com.cpg.lab7.exercise4;
import java.util.HashMap;
import java.util.Scanner;
public class MarksOfStudentsHashMapMain {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		
		System.out.println("Enter Map Size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int index = 0;
		
		while(index<size) {
			map1.put(sc.nextInt(),sc.nextInt());
			index++;
		}
		
		MarksOfStudentsHashMap obj = new MarksOfStudentsHashMap();
		System.out.println(obj.getStudents(map1));

	}

}
