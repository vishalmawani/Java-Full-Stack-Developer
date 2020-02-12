package com.cpg.lab3.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class StringArraySort {

			Scanner sc=new Scanner(System.in);
			
			String string=sc.nextLine();
			
		
		
		public void upperLower() {
			
			char tempArray[] = string.toCharArray(); 
	        Arrays.sort(tempArray);
	        String string2=new String(tempArray);
	        
	        String s1=(string2.substring(0, (string2.length()/2)).toUpperCase());
	        String s2=(string2.substring((string2.length()/2), (string2.length())).toLowerCase());
	        System.out.println(s1+s2);
		}
}
