package com.jbk.Object;

public class Student {

	private int age;
	private String name;
	private Address address;
	
	public Student(int age,String name,Address address) {
		this.age=age;
		this.name=name;
		this.address=address;
	}
	
	public void showdata()
	{
		System.out.println("Age :" +age);
		System.out.println("Name :" +name);
		System.out.println("**** Address ***** \n"+address.show());
	}
}
