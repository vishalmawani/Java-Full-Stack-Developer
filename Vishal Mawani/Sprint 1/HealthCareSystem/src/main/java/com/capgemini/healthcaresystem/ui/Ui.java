package com.capgemini.healthcaresystem.ui;

import java.util.Scanner;
import com.capgemini.healthcaresystem.dto.DiagnosticTest;
import com.capgemini.healthcaresystem.exception.NullCenterId;
import com.capgemini.healthcaresystem.exception.NullTestValue;
import com.capgemini.healthcaresystem.service.TestService;
import com.capgemini.healthcaresystem.util.TestRepository;

public class Ui {

	TestService testServiceObject = new TestService();
	
	TestRepository testRepositoryObject = new TestRepository();
	Scanner sc = new Scanner(System.in);

	
	public static void main(String arg[]){
		Ui uiObject = new Ui();
		uiObject.execute();
		}
	
	
	
	public void execute(){
		
		System.out.println("Choose one option:");
		System.out.println("1. Add a test       2.Remove a test");
		
		
		
		try {	
			switch(getChoice()) {
		
		case 1:
			//System.out.println(testServiceObject.getCenterIdCenterNameMapService());
			
			DiagnosticTest temp = new DiagnosticTest(null,getTestName());
			
			String cid = getCenterId();
			testServiceObject.addTestService(cid,temp);
			break;
			
		case 2:
			//System.out.println(testServiceObject.getCenterIdCenterNameMapService());
			sc.nextLine();
			String cid1 = getCenterId();
			//System.out.println(testServiceObject.getCenterIdTestListService(cid1));
			String tid = getTestIdUser();
			String tname = getTestName();
			DiagnosticTest temp1 = new DiagnosticTest(tid,tname);
			testServiceObject.removeTestService(cid1,temp1);		
			break;
		
		default:
			System.out.println("Choice entered is not correct");
			break;
			
		}
		}
		
		catch(NullTestValue | NullCenterId e) {
			System.out.println(e.getMessage());
		}
		}

	
	
	private String getTestIdUser() {
		System.out.println("Enter test id:");
		return sc.nextLine();
	}



	public int getChoice() {
		return sc.nextInt();
	}
	
	public String getCenterId() {
		System.out.println("Enter Center Id:");
		
		return sc.nextLine();
		 
	}
			
	public String getTestId() {
		return testServiceObject.getTestIdService();
	}
	
	public String getTestName() {
		System.out.println("Enter test name:");
		sc.nextLine();
		return sc.nextLine();
		
	}
	
}
