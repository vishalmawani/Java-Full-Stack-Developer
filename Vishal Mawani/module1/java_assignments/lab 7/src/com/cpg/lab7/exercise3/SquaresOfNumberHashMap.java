package com.cpg.lab7.exercise3;

import java.util.HashMap;

public class SquaresOfNumberHashMap {
	
  HashMap<Integer,Integer> getSquares(int[] array){
	  HashMap <Integer,Integer> map1 = new HashMap<Integer,Integer>();
	  for(int number:array) {
		  map1.put(number, (number*number));
	  }
	  
	  return map1;
	  
  }
}
