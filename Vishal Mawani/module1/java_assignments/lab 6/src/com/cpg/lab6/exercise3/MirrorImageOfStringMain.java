package com.cpg.lab6.exercise3;

public class MirrorImageOfStringMain {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("VISHAL");
		
		MirrorImageOfString obj = new MirrorImageOfString();
		
		
System.out.println(sb1 + "|" + obj.getImage(sb1));
	}

}
