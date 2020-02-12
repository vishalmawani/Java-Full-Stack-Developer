package com.cpg.lab6.exercise1;


import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
	Scanner sc = new Scanner(System.in);
	StringTokenizer str = new StringTokenizer("1 2 3 4 5 6"," ");
	
	int sum = 0;
	   
	    
	    public void displayData() {
	    	while(str.hasMoreTokens())
	    	{
	    			System.out.println(str.nextToken());
	    			
	    			}
	   }
	    
	    public void calculateSum() {
	    	while(str.hasMoreTokens()) {
	    		int b = 0;
	    		b = Integer.parseInt(str.nextToken());
	    		System.out.println(b);
	    		sum = sum+b;
	    	}
	    	System.out.println(sum);
	    }}
	    
	    
	