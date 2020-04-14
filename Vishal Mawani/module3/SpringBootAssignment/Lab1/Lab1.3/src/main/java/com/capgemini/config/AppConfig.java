package com.capgemini.config;

import org.springframework.context.annotation.Bean;

import com.capgemini.pojo.Employee;
import com.capgemini.pojo.SBU;

public class AppConfig {

	@Bean(name = "emp1")
	public Employee getEmployee1() {
		Employee emp1 = new Employee();
		emp1.setEmployeeId(1234);
		emp1.setEmployeeName("Vishal");
		emp1.setSalary(40000);
		return emp1;
	}

	@Bean(name = "emp2")
	public Employee getEmployee2() {
		Employee emp2 = new Employee();
		emp2.setEmployeeId(1235);
		emp2.setEmployeeName("Rahul");
		emp2.setSalary(40000);
		return emp2;
	}

	@Bean(name = "emp3")
	public Employee getEmployee3() {
		Employee emp3 = new Employee();
		emp3.setEmployeeId(1236);
		emp3.setEmployeeName("Ashish");
		emp3.setSalary(40000);
		return emp3;
	}

	@Bean(name = "sbu")
	public SBU getSBU() {
		SBU sbu = new SBU();
		sbu.setSbuId(121);
		sbu.setSbuName("PES-BU");
		sbu.setSbuHead("Kiran Rao");
		sbu.getEmpList().add(getEmployee1());
		sbu.getEmpList().add(getEmployee2());
		sbu.getEmpList().add(getEmployee3());

		return sbu;
	}
}
