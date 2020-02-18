package com.capgemini.healthcaresystem.dao;



import com.capgemini.healthcaresystem.dto.Test;
import com.capgemini.healthcaresystem.ui.Ui;
import com.capgemini.healthcaresystem.util.TestRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class TestDao {

	

	public String addTestDao(String cId,Test test) {
		
		 for (Entry<String, List<Test>> entry : TestRepository.getCenterIdTestListMap().entrySet()) {
	            String key = entry.getKey();
	            System.out.println(key);
	            if(key.equals(cId)) {
	            	List<Test> values = entry.getValue();
	            	 values.add(test);
	            	 TestRepository.getCenterIdTestListMap().put(key, values);
	            	 
	            }
	           
		 }
		 System.out.println(TestRepository.getCenterIdTestListMap());
		
		return "added successfully";
	}



	public boolean removeTestDao(Test test) {
		
	
		
		return true;
	}
	
	
		
	public Map<String,String> getCenterIdCenterNameMapDao() {
	return TestRepository.getCenterIdCenterNameMap();
	}
	
	public String getTestIdDao() {
		return TestRepository.getTestId();
	}
}
