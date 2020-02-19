package com.capgemini.healthcaresystem.dto;

import java.util.List;

import com.capgemini.healthcaresystem.util.TestRepository;
public class DiagnosticCenter {
	
	private String centerName;
	private String centerId;
	public static List<DiagnosticTest> listOfTests;
	public static List<Appointment> appointmentList;
	static int randomCenterId=1001;
	
	
	public DiagnosticCenter() {
		
	}
	
	public DiagnosticCenter(String centerName, String centerId, List<DiagnosticTest> listOfTests,
			List<Appointment> appointmentList) {
		super();
		this.centerName = centerName;
		this.centerId = centerId;
		DiagnosticCenter.listOfTests = listOfTests;
		DiagnosticCenter.appointmentList = appointmentList;
	}
	
	// Getters and Setters
	
	public String getCenterName() {
		return centerName;
	}
	
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public List<DiagnosticTest> getListOfTests() {
		return listOfTests;
	}
	public void setListOfTests(List<DiagnosticTest> listOfTests) {
		this.listOfTests = listOfTests;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	
	
	
}
