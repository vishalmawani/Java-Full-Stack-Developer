package com.capgemini.healthcaresystem.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.capgemini.healthcaresystem.dao.TestDao;
import com.capgemini.healthcaresystem.dto.Test;

public class TestDaoTest {

	void checkAddTestDao() {
		Test obj = new Test("112","cancer");
		TestDao daoObject = new TestDao();
		assertEquals("added successfully" ,daoObject.addTestDao("1001", obj));
		
	}
}
