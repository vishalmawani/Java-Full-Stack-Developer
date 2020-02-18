package com.capgemini.healthcaresystem.util;

import com.capgemini.healthcaresystem.dto.DiagnosticCenter;
import com.capgemini.healthcaresystem.dto.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestRepository {
	
	private static Map<String,String> centerIdCenterNameMap = new TreeMap<String,String>();
	
	private static Map<String,List<Test>> centerIdTestListMap = new TreeMap<String,List<Test>>();
	
	


		public TestRepository() {
		
			makeCenterIdCenterNameMap();
			makeCenterIdTestListMap();
			
		}
		
		public void makeCenterIdCenterNameMap() {
			centerIdCenterNameMap.put("1001","AIMS");
			centerIdCenterNameMap.put("1002","MAX");
			centerIdCenterNameMap.put("1003","APOLO");
			centerIdCenterNameMap.put("1004","FORTIS");
			centerIdCenterNameMap.put("1005","TRAUMA CENTER");
			
		}
		
		public void makeCenterIdTestListMap() {
			
			List<Test> listOfTests1 = new ArrayList<Test>();
			populateListOfTests(listOfTests1);
			centerIdTestListMap.put("1001",listOfTests1);
			
			List<Test> listOfTests2 = new ArrayList<Test>();
			populateListOfTests(listOfTests2);
			centerIdTestListMap.put("1002",listOfTests2);
			
			List<Test> listOfTests3 = new ArrayList<Test>();
			populateListOfTests(listOfTests3);
			centerIdTestListMap.put("1003",listOfTests3);
			
			List<Test> listOfTests4 = new ArrayList<Test>();
			populateListOfTests(listOfTests4);
			centerIdTestListMap.put("1004",listOfTests4);
			
			List<Test> listOfTests5 = new ArrayList<Test>();
			populateListOfTests(listOfTests5);
			centerIdTestListMap.put("1005",listOfTests5);
			
		
		}
		
		public List<Test> populateListOfTests(List<Test> temp){
			Test t1 = new Test(getTestId(),"blood group");
			Test t2 = new Test(getTestId(),"blood sugar");
			Test t3 = new Test(getTestId(),"blood pressure");
			temp.add(t1);
			temp.add(t2);
			temp.add(t3);
			return temp;
			
			
		}

		
		
		public static Map<String, String> getCenterIdCenterNameMap() {
		return centerIdCenterNameMap;
	}

		

		public static Map<String, List<Test>> getCenterIdTestListMap() {
		return centerIdTestListMap;
	}

		
	
		
		
		
		public static String getTestId() {
																	//Method or function to generate testId automatically...
			Test testObject = new Test();
			return testObject.generateTestId();
		}
		
		
		
		
	/*	public static void main(String arg[]) {
			Test obj = new Test("110","abc");
			TestRepository object = new TestRepository();
			
			
			System.out.println(centerIdTestListMap);
			 for (Entry<String, List<Test>> entry : centerIdTestListMap.entrySet()) {
		            String key = entry.getKey();
		            List<Test> values = entry.getValue();
		            System.out.println("Key = " + key);
		            System.out.println("Values = " + values.add(obj));
		            System.out.println("Values = " + values.get(3).getTestName());
		        }
			
			
		}*/
		
			}
		

