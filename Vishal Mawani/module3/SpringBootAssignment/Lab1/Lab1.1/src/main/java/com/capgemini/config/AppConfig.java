package com.capgemini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.pojo.Employee;

@Configuration
public class AppConfig {

	@Bean(name = "employee")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeId(12345);
		employee.setEmployeeName("Harriet");
		employee.setSalary(40000);
		employee.setBusinessUnit("PES-BU");
		employee.setAge(30);

		return employee;
	}

}
