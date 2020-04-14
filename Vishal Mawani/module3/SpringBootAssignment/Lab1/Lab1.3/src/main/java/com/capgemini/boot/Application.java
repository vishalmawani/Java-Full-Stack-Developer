package com.capgemini.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.config.AppConfig;
import com.capgemini.pojo.Employee;
import com.capgemini.pojo.SBU;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SBU sbu = context.getBean("sbu",SBU.class);
		System.out.println(sbu);
		System.out.println(sbu.getEmpList());
	}
}
