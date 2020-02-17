package com.capgemini.healthcaresystem.service;

import com.capgemini.healthcaresystem.dao.TestDao;
import com.capgemini.healthcaresystem.dto.Test;
import com.capgemini.healthcaresystem.exception.NullTestValue;

public class TestService {
	public TestDao testDaoObject;
	
	
	public String addTestService(Test test) throws NullTestValue {
		if(test == null) {
			throw new NullTestValue("Test object passed is null");
		}
		testDaoObject.addTestDao(test);
		return null;
	}

	
	
	public boolean removeTestService(Test test) throws NullTestValue {
		if(test == null) {
			throw new NullTestValue("Test object passed is null");
		}
		testDaoObject.removeTestDao(test);
		return true;
	}
	
	
	public String userEnteredCenterIdService(String cId) {
		return cId;
	}
}
