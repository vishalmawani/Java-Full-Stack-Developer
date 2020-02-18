package com.capgemini.healthcaresystem.service;

import java.util.List;

import java.util.Map;

import com.capgemini.healthcaresystem.dao.TestDao;
import com.capgemini.healthcaresystem.dto.DiagnosticTest;
import com.capgemini.healthcaresystem.exception.NullCenterId;
import com.capgemini.healthcaresystem.exception.NullTestValue;

public class TestService {
	
	 TestDao testDaoObject = new TestDao();
	
	public TestService() {
		
	}

	public String addTestService(String cId,DiagnosticTest diagnosticTest) throws NullTestValue, NullCenterId {
		if(cId.isEmpty()) {
			throw new NullCenterId("Center Id passed is null");
		}
		if(diagnosticTest == null) {
			throw new NullTestValue("Test object passed is null");
		}
		testDaoObject.addTestDao(cId,diagnosticTest);
		return "abc";
	}

	
	
	public boolean removeTestService(String cid,String testname,DiagnosticTest diagnosticTest) throws NullTestValue {
		if(diagnosticTest == null) {
			throw new NullTestValue("Test object passed is null");
		}
		testDaoObject.removeTestDao(cid,testname,diagnosticTest);
		return true;
	}
	
	public List<String> getCenterIdTestListService(String cid) throws NullCenterId{
		if(cid.isEmpty()) {
			throw new NullCenterId("Center Id is passed null");
		}
		
		return testDaoObject.getCenterIdTestListDao(cid);
		
	}
	
	public Map<String,String> getCenterIdCenterNameMapService() {
		return testDaoObject.getCenterIdCenterNameMapDao();
	}
	
	
	public String getTestIdService() {
		return testDaoObject.getTestIdDao();
	}
	
}
