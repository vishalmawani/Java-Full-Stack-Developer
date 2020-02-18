package com.capgemini.healthcaresystem.dao;



import com.capgemini.healthcaresystem.dto.DiagnosticTest;
import com.capgemini.healthcaresystem.ui.Ui;
import com.capgemini.healthcaresystem.util.TestRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class TestDao {

	

	public String addTestDao(String cId,DiagnosticTest diagnosticTest) {
		
		 for (Entry<String, List<DiagnosticTest>> entry : TestRepository.getCenterIdTestListMap().entrySet()) {
	            String key = entry.getKey();
	            System.out.println(key);
	            if(key.equals(cId)) {
	            	List<DiagnosticTest> values = entry.getValue();
	            	 values.add(diagnosticTest);
	            	 TestRepository.getCenterIdTestListMap().put(key, values);
	            	 
	            }
	           
		 }
		 System.out.println(TestRepository.getCenterIdTestListMap());
		
		return "added successfully";
	}



	public boolean removeTestDao(String cid,String testname,DiagnosticTest diagnosticTest) {
		
	return true;
	}
	
	public List<String> getCenterIdTestListDao(String cid){
		List<String> tempDao = new ArrayList<String>();
		for (Entry<String, List<DiagnosticTest>> entry : TestRepository.getCenterIdTestListMap().entrySet()) {
            String key = entry.getKey();
            System.out.println(key);
            if(key.equals(cid)) {
            	List<DiagnosticTest> values = entry.getValue();
            	for(int i=0;i<values.size();i++) {
            		tempDao.add(values.get(i).getTestName());
            	}
	}
		}
		return tempDao;}
	public Map<String,String> getCenterIdCenterNameMapDao() {
	return TestRepository.getCenterIdCenterNameMap();
	}
	
	
            
            
		
	
	public String getTestIdDao() {
		return TestRepository.getTestId();
	}
}
