package com.cpg.lab7.exercise1;


import java.util.*;
import java.util.Map.Entry;


public class HashMapSortedAsList {
 
		ArrayList getValues(HashMap<Integer,Integer> hashmap) {
			
			Set<Integer>keySet = hashmap.keySet();
			Collection<Integer> values = hashmap.values();
			
			ArrayList<Integer>listOfKeys = new ArrayList<Integer>(keySet);
			ArrayList<Integer>listOfValues = new ArrayList<Integer>(values);
			
			//Set<Entry<String, String>> entrySet = hashmap.entrySet(); 
			//ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String, String>>(entrySet);
			Collections.sort(listOfValues,Collections.reverseOrder());
			return listOfValues;
		}
}
