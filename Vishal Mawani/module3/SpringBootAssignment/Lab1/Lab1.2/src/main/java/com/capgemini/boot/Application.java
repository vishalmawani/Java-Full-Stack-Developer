package com.capgemini.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.config.AppConfig;
import com.capgemini.pojo.Employee;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);
	}
}
