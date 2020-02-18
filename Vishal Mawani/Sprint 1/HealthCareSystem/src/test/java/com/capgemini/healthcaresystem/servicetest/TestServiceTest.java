package com.capgemini.healthcaresystem.servicetest;

import com.capgemini.healthcaresystem.dto.DiagnosticTest;
import com.capgemini.healthcaresystem.exception.NullCenterId;
import com.capgemini.healthcaresystem.exception.NullTestValue;
import com.capgemini.healthcaresystem.service.TestService;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TestServiceTest {
	
	@Test
	void checkAddTestService() throws NullCenterId, NullTestValue {
		DiagnosticTest obj = new DiagnosticTest("110","malaria");
		TestService serviceObject = new TestService();
		assertEquals("abc",serviceObject.addTestService("",obj));
	}
	
	@Test
	void checkAddTestService1() throws NullTestValue, NullCenterId{
		DiagnosticTest obj = null;
		TestService serviceObject = new TestService();
		assertEquals("abc", serviceObject.addTestService("1001",obj));
	}
	
	@Test
	void checkAddTestService2() throws NullTestValue, NullCenterId{
		DiagnosticTest obj = new DiagnosticTest("110","malaria");
		TestService serviceObject = new TestService();
		assertEquals("abc", serviceObject.addTestService("1001",obj));
	}
}
