package com.capgemini.healthcaresystem.util;

import com.capgemini.healthcaresystem.dto.Test;
import java.util.ArrayList;
import java.util.List;

public class TestRepository {

	static List<Test>listOfTests = new ArrayList<Test>();
	
	static int randomTestId=100;
	
		public TestRepository() {
			
		
		
		Test t1 = new Test(generateTestId(),"Blood test");
		Test t2 = new Test(generateTestId(),"Sugar test");
		Test t3 = new Test(generateTestId(),"Hameglobin test");
		Test t4 = new Test(generateTestId(),"Malaria test");
		Test t5 = new Test(generateTestId(),"Corona test");
		Test t6 = new Test(generateTestId(),"Dengue test");           // Pushing values to the constructor of class 'Test'...
		Test t7 = new Test(generateTestId(),"X-Ray");
		Test t8 = new Test(generateTestId(),"CT-scan");
		Test t9 = new Test(generateTestId(),"Eye Test");
		Test t10= new Test(generateTestId(),"DNA test");
		Test t11= new Test(generateTestId(),"MRI Scan");
		Test t12 = new Test(generateTestId(),"Full Body Checkup");
		Test t13= new Test(generateTestId(),"Liver Function Test");
		
		
		listOfTests.add(t1);
		listOfTests.add(t2);
		listOfTests.add(t3);
		listOfTests.add(t4);
		listOfTests.add(t5);
		listOfTests.add(t6);										// Adding values to the list named listOfTests...
		listOfTests.add(t7);
		listOfTests.add(t8);
		listOfTests.add(t9);
		listOfTests.add(t10);
		listOfTests.add(t11);
		listOfTests.add(t12);
		listOfTests.add(t13);
		
	
		
		}
		
		public String generateTestId() {
																	//Method or function to generate testId automatically...
			randomTestId+=1;
			return Integer.toString(randomTestId);
			
		}
		
}


