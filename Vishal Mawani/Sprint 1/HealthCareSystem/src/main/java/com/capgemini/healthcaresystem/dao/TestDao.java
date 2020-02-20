package com.capgemini.healthcaresystem.dao;



import com.capgemini.healthcaresystem.dto.DiagnosticTest;
import com.capgemini.healthcaresystem.exception.NullCenterId;
import com.capgemini.healthcaresystem.util.TestRepository;

import java.util.List;
import java.util.Map.Entry;

public class TestDao {

	

	public String addTestDao(String cId,DiagnosticTest diagnosticTest){
		
		
		 for (Entry<String, List<DiagnosticTest>> entry : TestRepository.getCenterIdTestListMap().entrySet()) {
	            String key = entry.getKey();
	            
	            if(key.equals(cId)) {
	            	List<DiagnosticTest> values = entry.getValue();
	            	 values.add(diagnosticTest);
	            	 TestRepository.getCenterIdTestListMap().put(key, values);
	            	 
	            }
	           
	           
		 }
		
		
		return "added successfully";
	}



	public String removeTestDao(String cid,DiagnosticTest diagnosticTest) {
		 for (Entry<String, List<DiagnosticTest>> entry : TestRepository.getCenterIdTestListMap().entrySet()) {
	            String key = entry.getKey();
	            if(key.equals(cid)) {
	            	List<DiagnosticTest> values = entry.getValue();
	            	 values.remove(diagnosticTest);
	            	 TestRepository.getCenterIdTestListMap().put(key, values);
	            	
	            	 }
	           }
		 return "removed successfully";
	}
	

	
    public String getTestIdDao() {
		return TestRepository.getTestId();
	}
}
