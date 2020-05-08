package com.jbk.map1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	private String branch;
	private Map<String, String> map;
	
	
	public Student(String branch,Map<String ,String>map) {
		this.branch=branch;
		this.map=map;
		// TODO Auto-generated constructor stub
	}
	
	public void showdata()
	{
		System.out.println("Branch. :"+branch);
	    Set<Entry <String,String>> set=map.entrySet();  
Iterator<Entry<String, String>>itr=set.iterator();
while(itr.hasNext())
{
	Entry<String,String>entry=itr.next();
	System.out.println("Name :"+entry.getKey()+"  "+"Surname :"+entry.getValue());
}
		
	}
}
