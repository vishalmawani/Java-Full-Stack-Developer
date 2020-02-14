package com.capgemini.healthcaresystem.dto;

import java.util.List;

public class User {

	String userId;
	List<DiagnosticCenter> centerList;
	String userPassword;
	String userName;
	long contactNo;
	String userRole;
	String emailId;
	
	// Constructor
	
	public User(String userId, List<DiagnosticCenter> centerList, String userPassword, String userName,
			long contactNo, String userRole, String emailId) {
		super();
		this.userId = userId;
		this.centerList = centerList;
		this.userPassword = userPassword;
		this.userName = userName;
		this.contactNo = contactNo;
		this.userRole = userRole;
		this.emailId = emailId;
	}
	
	// Getters and Setters
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<DiagnosticCenter> getCenterList() {
		return centerList;
	}
	public void setCenterList(List<DiagnosticCenter> centerList) {
		this.centerList = centerList;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

	
	
}
