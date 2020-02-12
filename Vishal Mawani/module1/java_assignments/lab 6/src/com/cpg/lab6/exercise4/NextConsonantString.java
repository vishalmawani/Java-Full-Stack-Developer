package com.cpg.lab6.exercise4;

import java.util.Scanner;

public class NextConsonantString {

	public char[] alterString(char[] s) {
		for(int i=0; i<s.length;i++)
		{
			if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
			{
			}else
			{
			    s[i]=(char)((s[i])+1);
			}
			
		}return s;
	}

}
