package com.cpg.lab7.exercise5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.*;

public class CollectionData {
	public static int getSecondSmallest (int arr[])
	{
		int value;
		ArrayList<Integer> al=new ArrayList();
		for(int arrayindex=0;arrayindex<arr.length;arrayindex++)
		{
			al.add(arr[arrayindex]);
		}
		Collections.sort(al); 
		value =al.get(1);//fetch value according to index
		return value;
		
	}
	
	public static void main(String ar [])
	{
		int arr[]= {5,6,1,2,4,8,3};
		System.out.println(getSecondSmallest (arr));
	}

}
