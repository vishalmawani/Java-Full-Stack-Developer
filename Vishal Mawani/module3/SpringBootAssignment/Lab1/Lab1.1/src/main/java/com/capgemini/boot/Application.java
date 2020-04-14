package com.capgemini.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.config.AppConfig;
import com.capgemini.pojo.Employee;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println("Employee Details");
		System.out.println("-----------------------------------");
		System.out.println("Employee ID : " + employee.getEmployeeId());
		System.out.println("Employee Name : " + employee.getEmployeeName());
		System.out.println("Employee Salary : " + employee.getSalary());
		System.out.println("Employee BU : " + employee.getBusinessUnit());
		System.out.println("Employee Age : " + employee.getAge());
	}

}
