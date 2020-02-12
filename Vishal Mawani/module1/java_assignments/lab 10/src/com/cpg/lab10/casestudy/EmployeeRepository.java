package com.cpg.lab10.casestudy;

import java.time.LocalDate;
import java.util.ArrayList;
public class EmployeeRepository {

	public static void main(String[] args) {
			
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		
		list1.add(new Employee(12,"vishal","kumar","vishal162261@gmail.com","7568051775",LocalDate.of(2019,01,02),"cheif engineer",30000.00,1001));
		list1.add(new Employee(121,"sachin","kantiwal","s.k.1999@gmail.com","7561223344",LocalDate.of(2018,10,12),"system analyst",10000.00,1001));
		list1.add(new Employee(11,"himanshu","raj","himuraj5@gmail.com","9876543219",LocalDate.of(2015,03,10),"software developer",35000.00,1002));
		list1.add(new Employee(111,"rahul","singh","vishalkumar@gmail.com","7986555283",LocalDate.of(2018,01,01),"tester",20000.00,1002));
		list1.add(new Employee(13,"ashish","kumar","ashish261@gmail.com","7568075775",LocalDate.of(2019,07,02),"r&d department",15000.00,1003));
		list1.add(new Employee(131,"karan","singh","karan261@gmail.com","9116383300",LocalDate.of(2018,06,25),"project leader",17000.00,1003));
		list1.add(new Employee(131,"samkalp","roy","sankalp261@gmail.com","9116381000",LocalDate.of(2017,06,25),"s/w engineer",50000.00,0));
		list1.add(new Employee(131,"jonny","singh","jsingh261@gmail.com","19116383300",LocalDate.of(2019,06,25),"network engineer",25000.00,0));
		
		ArrayList<Department> list2 = new ArrayList<Department>();
		
		list2.add(new Department(1,"CSE",1001));
		list2.add(new Department(2,"MEC",1002));
		list2.add(new Department(3,"CIV",1003));
		
	
	
		
	}	}


