package com.capgemini.config;

import org.springframework.context.annotation.Bean;

import com.capgemini.pojo.Employee;
import com.capgemini.pojo.SBU;

public class AppConfig {

	@Bean(name="employee")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeId(1234);
		employee.setEmployeeName("Vishal");
		employee.setSalary(40000);
		employee.setBusinessUnit(getSBU());
		return employee;
	}
	
	@Bean(name="sbu")
	public SBU getSBU() {
		SBU sbu = new SBU();
		sbu.setSbuId(121);
		sbu.setSbuName("PES-BU");
		sbu.setSbuHead("Varsha Lonkar");
		return sbu;
	}
}
