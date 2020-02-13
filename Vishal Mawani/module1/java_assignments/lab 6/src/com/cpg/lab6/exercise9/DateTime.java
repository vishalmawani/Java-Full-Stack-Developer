package com.cpg.lab6.exercise9;

import java.time.LocalDate;
import java.time.Period;

public class DateTime {
	
	public static void dates(LocalDate d)
	{
		LocalDate myObj = LocalDate.now();
	    Period intervalPeriod = Period.between(d, myObj);
	    
	    System.out.println("Difference of days: " + intervalPeriod.getDays());
	    System.out.println("Difference of months: " + intervalPeriod.getMonths());
	    System.out.println("Difference of years: " + intervalPeriod.getYears());
	}
	public static void main(String ar[])
	{
		LocalDate myObj = LocalDate.of(1999,02,04);
		dates( myObj);
	}

}