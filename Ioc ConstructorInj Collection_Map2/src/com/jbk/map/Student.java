package com.jbk.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	private int id;
	private String course;
	Map<Pd,Address>map;
	
	public Student(int id,String course,Map<Pd,Address>map) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.course=course;
		this.map=map;
	}
	
	public void showdata()
	{
		System.out.println("ID :"+id);
		System.out.println("Course :"+course);
		
		Set <Entry<Pd,Address>>set=map.entrySet();
		Iterator<Entry<Pd, Address>>itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Pd, Address>entry=itr.next();
			Pd pd=entry.getKey();
			Address addr=entry.getValue();
			
			System.out.println("****** Persional Detai ******");
			System.out.println(pd);
			System.out.println("****** Address******");
			System.out.println(addr);
		}
	}
}
