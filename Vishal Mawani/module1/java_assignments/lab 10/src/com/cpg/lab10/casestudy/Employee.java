package com.cpg.lab10.casestudy;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {

    private	int employeeID;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private String designation;
	private double salary;
	private int managerId;
   
		public Employee() {
			
		}
	
	public Employee(int employeeID, String firstName, String lastName, String email, String phoneNumber,
			LocalDate hireDate, String designation, double salary, int managerId) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		//this.department = department;
		
		
}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", designation=" + designation
				+ ", salary=" + salary + ", managerId=" + managerId + "]";
	}
	
	
	
	
	
}
