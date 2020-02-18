package com.capgemini.healthcaresystem.servicetest;

import com.capgemini.healthcaresystem.exception.NullCenterId;
import com.capgemini.healthcaresystem.exception.NullTestValue;
import com.capgemini.healthcaresystem.service.TestService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestServiceTest {

	void checkAddTestService() throws NullTestValue, NullCenterId {
		TestService serviceObject = new TestService();
		assertEquals("null null", serviceObject.addTestService(null, null));
	}
}
