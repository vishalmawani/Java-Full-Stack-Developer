package com.capgemini.healthcaresystem.dao;



import com.capgemini.healthcaresystem.dto.Test;

import com.capgemini.healthcaresystem.util.TestRepository;

import java.util.ArrayList;
import java.util.List;

public class TestDao {

	TestRepository testRepositoryObject = new TestRepository();


	public String addTestDao(Test test) {
		
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
