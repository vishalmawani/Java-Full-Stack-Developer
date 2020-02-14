package com.cpg.lab7.exercise2;

import java.util.HashMap;

public class CountCharacterHashmap {

		HashMap<Character, Integer> countCharacter(char[] array) {
			
			HashMap <Character,Integer> countMap = new HashMap<Character,Integer>();
			
			for(char c:array) {
				if(countMap.containsKey(c))
					countMap.put(c,countMap.get(c)+1);
				else
					countMap.put(c,1);
			}
			return countMap;
		}
}
