package com.capgemini.healthcaresystem.ui;

import java.util.Scanner;

import com.capgemini.healthcaresystem.dao.TestDao;
import com.capgemini.healthcaresystem.dto.Test;
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
		
		
		
		try {	switch(getChoice()) {
		
		case 1:
			System.out.println(testServiceObject.getCenterIdCenterNameMapService());
			Test temp = new Test(getTestId(),getTestName());
			String cid = getCenterId();
			testServiceObject.addTestService(cid,temp);
			
			
			break;
			
		case 2:
			
			break;
		
		default:
			System.out.println("Choice entered is not correct");
			break;
			
		}
		}
		
		catch(NullTestValue e) {
			System.out.println(e.getMessage());
		}
		catch(NullCenterId e) {
			System.out.println(e.getMessage());
		}
		}

	
	public int getChoice() {
		int choice = sc.nextInt();
		return choice;
	}
	
	public String getCenterId() {
		System.out.println("Enter Center Id:");
		
		String userInputCenterId = sc.nextLine();
		return userInputCenterId;
	}
			
	public String getTestId() {
		return testServiceObject.getTestIdService();
	}
	public String getTestName() {
		System.out.println("Enter test name:");
		sc.nextLine();
		String userInputTestName = sc.nextLine();
		return userInputTestName;
	}
	
}
