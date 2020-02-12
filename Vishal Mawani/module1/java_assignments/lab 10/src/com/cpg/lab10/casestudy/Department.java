package com.cpg.lab10.casestudy;

import java.util.ArrayList;

public class Department {
	
	private int departmentId;
	private String departName;
	private int managerId;
	
	public Department() {
		
	}
	
	public Department(int departmentId, String departName, int managerId) {
		super();
		this.departmentId = departmentId;
		this.departName = departName;
		this.managerId = managerId;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartName() {
		return departName;
	}


	public void setDepartName(String departName) {
		this.departName = departName;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departName=" + departName + ", managerId=" + managerId
				+ "]";
	}

public void display() {
	System.out.println(departName);
}
	
	
}
