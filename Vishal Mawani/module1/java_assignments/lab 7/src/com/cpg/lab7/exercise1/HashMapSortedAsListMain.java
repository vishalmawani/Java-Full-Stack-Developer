package com.cpg.lab7.exercise1;

import java.util.HashMap;

public class HashMapSortedAsListMain {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		
		hashmap.put(2, 50);
		hashmap.put(10, 2);
		hashmap.put(5, 15);
		hashmap.put(1,25);
		
		HashMapSortedAsList obj = new HashMapSortedAsList();
		System.out.println(obj.getValues(hashmap));

	}

}
