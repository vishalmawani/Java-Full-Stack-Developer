package com.capgemini.healthcaresystem.service;

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
		return "added successfully";
	}

	
	
	public String removeTestService(String cid,DiagnosticTest diagnosticTest) throws NullTestValue, NullCenterId {
		
		if(diagnosticTest == null) {
			throw new NullTestValue("Test object passed is null");
		}
		
		if(cid.isEmpty()) {
			throw new NullCenterId("Center Id passed is null");
		}
		
		testDaoObject.removeTestDao(cid,diagnosticTest);
		return "called testDao remove";
	}
	
	
	
	public String getTestIdService() {
		return testDaoObject.getTestIdDao();
	}
	
}
