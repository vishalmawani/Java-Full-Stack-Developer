package com.cpg.lab7.exercise4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MarksOfStudentsHashMap {
   
	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> map1){
		
		HashMap <Integer,String> map2 = new HashMap<Integer,String>();
		
		Set entrySet = map1.entrySet();
		
		Iterator it = entrySet.iterator();
		int key;
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			key=(int) me.getValue();
			
			if(key>=90)
				map2.put((Integer) (me.getKey()),"GOLD");
			
			if((key>=80) && (key<90))
				map2.put((Integer) (me.getKey()),"Silver");
			
			if((key>=70) && (key<80))
				map2.put((Integer) (me.getKey()),"Bronze");
		}
		return map2;
	}
}
