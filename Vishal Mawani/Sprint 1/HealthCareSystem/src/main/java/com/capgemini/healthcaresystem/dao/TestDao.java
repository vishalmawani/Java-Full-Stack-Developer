package com.capgemini.healthcaresystem.dao;



import com.capgemini.healthcaresystem.dto.Test;

import com.capgemini.healthcaresystem.util.TestRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class TestDao {

	TestRepository testRepositoryObject = new TestRepository();


	public String addTestDao(Test test) {
		
	/*	 for (Entry<String, List<Test>> entry : centerIdTestListMap.entrySet()) {
	            String key = entry.getKey();
	            List<Test> values = entry.getValue();
	            System.out.println("Key = " + key);
	            System.out.println("Values = " + values.add(obj));
	            System.out.println("Values = " + values.get(3).getTestName());
	        }*/
		//System.out.println(testRepositoryObject.getCenterIdTestListMap().computeIfPresent(userEnteredCenterIdDao(),(k,v)->v.add(test)));
		return null;
	}



	



	public boolean removeTestDao(Test test) {
		
		
		
		return true;
	}

	
	
public String userEnteredCenterIdDao(String cId) {
	return cId;
}
	
	
	
}
