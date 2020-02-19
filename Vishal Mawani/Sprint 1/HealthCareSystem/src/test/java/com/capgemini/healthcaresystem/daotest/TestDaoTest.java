package com.capgemini.healthcaresystem.daotest;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.healthcaresystem.dao.TestDao;
import com.capgemini.healthcaresystem.dto.DiagnosticTest;
import com.capgemini.healthcaresystem.service.TestService;

public class TestDaoTest {
	
	@Test
	public void checkAddTestDao(){
		DiagnosticTest obj = new DiagnosticTest("112","cancer");
		TestDao daoObject = new TestDao();
		assertEquals("added successfully" ,daoObject.addTestDao("1001", obj));
		
	}
	
	@Test
public void checkRemoveTestDao() {
		DiagnosticTest obj = new DiagnosticTest("102","blood sugar");
		TestDao daoObject = new TestDao();
		assertEquals("removed successfully" ,daoObject.removeTestDao("1002",obj));
	}
	
}
