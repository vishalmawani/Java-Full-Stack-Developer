package com.capgemini.healthcaresystem.dto;

public class DiagnosticTest {

	 private String testId;
	 private String testName;
	
	
	// Constructor
	
	 public DiagnosticTest() {
		 
	 }
	 
	public DiagnosticTest(String testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	
	// Getters and Setters
	
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	

}
