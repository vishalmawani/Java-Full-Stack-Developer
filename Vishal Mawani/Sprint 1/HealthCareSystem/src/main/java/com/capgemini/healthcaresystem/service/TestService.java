package com.capgemini.healthcaresystem.service;

import java.util.Map;

import com.capgemini.healthcaresystem.dao.TestDao;
import com.capgemini.healthcaresystem.dto.Test;
import com.capgemini.healthcaresystem.exception.NullCenterId;
import com.capgemini.healthcaresystem.exception.NullTestValue;

public class TestService {
	
	 TestDao testDaoObject = new TestDao();
	
	public TestService() {
		
	}

	public String addTestService(String cId,Test test) throws NullTestValue, NullCenterId {
		if(cId.isEmpty()) {
			throw new NullCenterId("Center Id passed is null");
		}
		if(test == null) {
			throw new NullTestValue("Test object passed is null");
		}
		testDaoObject.addTestDao(cId,test);
		return "abc";
	}

	
	
	public boolean removeTestService(Test test) throws NullTestValue {
		if(test == null) {
			throw new NullTestValue("Test object passed is null");
		}
		testDaoObject.removeTestDao(test);
		return true;
	}
	
	
	public Map<String,String> getCenterIdCenterNameMapService() {
		return testDaoObject.getCenterIdCenterNameMapDao();
	}
	
	public String getTestIdService() {
		return testDaoObject.getTestIdDao();
	}
	
}
