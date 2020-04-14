package com.capgemini.boot;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.pojo.Employee;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		Employee employee = context.getBean("emp3", Employee.class);

		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.close();

		for (Employee emp : employee.getEmpList()) {
			if (emp.getEmpId() == id) {
				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpName());
				System.out.println(emp.getSalary());
			}
		}
	}
}
