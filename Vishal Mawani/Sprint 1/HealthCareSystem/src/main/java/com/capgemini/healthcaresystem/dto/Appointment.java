package com.capgemini.healthcaresystem.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;


public class Appointment {

	User user;
	private BigInteger appointmentId;
	DiagnosticTest diagnosticTest;
	private LocalDateTime datetime;
	private boolean approved;
	
	// Constructor
	
	public Appointment(User user, BigInteger appointmentId, DiagnosticTest diagnosticTest, LocalDateTime datetime, boolean approved) {
		super();
		this.user = user;
		this.appointmentId = appointmentId;
		this.diagnosticTest = diagnosticTest;
		this.datetime = datetime;
		this.approved = approved;
	}
	
	// Getters and Setters
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BigInteger getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(BigInteger appointmentId) {
		this.appointmentId = appointmentId;
	}
	public DiagnosticTest getTest() {
		return diagnosticTest;
	}
	public void setTest(DiagnosticTest diagnosticTest) {
		this.diagnosticTest = diagnosticTest;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	
}
