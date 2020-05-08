package com.jbk.collection;

import java.util.Iterator;
import java.util.List;

public class Student {

	private int rollno;
	private String name;
	private List mono;
	
	public Student(int rollno,String name,List<String>mono) {
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.name=name;
		this.mono=mono;
	}
	
	
	public void showdata()
	{
		System.out.println("Roll No. :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Mobile No.");
		Iterator<String> itr=mono.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
