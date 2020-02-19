package com.capgemini.healthcaresystem.servicetest;

import com.capgemini.healthcaresystem.dto.DiagnosticTest;
import com.capgemini.healthcaresystem.exception.NullCenterId;
import com.capgemini.healthcaresystem.exception.NullTestValue;
import com.capgemini.healthcaresystem.service.TestService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestServiceTest {
	
	@Test
	void checkAddTestService() throws NullCenterId, NullTestValue {
		DiagnosticTest obj = new DiagnosticTest("110","malaria");
		TestService serviceObject = new TestService();
		Throwable exception = assertThrows(Exception.class, ()->{serviceObject.addTestService("",obj);});
		assertEquals("Center Id passed is null",exception.getMessage());
	}
	
	@Test
	void checkAddTestService1() throws NullTestValue, NullCenterId{
		DiagnosticTest obj = null;
		TestService serviceObject = new TestService();
		Throwable exception = assertThrows(Exception.class, ()->{serviceObject.addTestService("1001",obj);});
		assertEquals("Test object passed is null",exception.getMessage());
	}
	
	@Test
	void checkAddTestService2() throws NullTestValue, NullCenterId{
		DiagnosticTest obj = new DiagnosticTest("110","malaria");
		TestService serviceObject = new TestService();
		assertEquals("abc", serviceObject.addTestService("1001",obj));
	}
	
	
	@Test
	public void checkRemoveTestService() throws NullTestValue, NullCenterId {
		DiagnosticTest obj = new DiagnosticTest("102","blood sugar");
		TestService serviceObject = new TestService();
		Throwable exception = assertThrows(Exception.class, ()->{serviceObject.removeTestService("",obj);});
		assertEquals("Center Id passed is null",exception.getMessage());
	}
	
	@Test
	
	public void checkRemoveTestService1() throws NullTestValue, NullCenterId {
		DiagnosticTest obj = null;
		TestService serviceObject = new TestService();
		Throwable exception = assertThrows(Exception.class, ()->{serviceObject.removeTestService("1001",obj);});
		assertEquals("Test object passed is null",exception.getMessage());
		
	}
	
	@Test
	public void checkRemoveTestService2() throws NullTestValue, NullCenterId {
		DiagnosticTest obj = new DiagnosticTest("102","blood sugar");
		TestService serviceObject = new TestService();
		assertEquals("called testDao remove",serviceObject.removeTestService("1001", obj));
		
	}
	
	@Test
	public void checkGetTestIdService() {
		TestService serviceObject = new TestService();
		String str = serviceObject.getTestIdService();
		assertEquals(Integer.toString((Integer.parseInt(str)+1)),serviceObject.getTestIdService());
	}
}
