package com.jbk.inhetitance;

public class Student {
	private int rollno;
	private String fname;
	private String sname;

	public Student(int rollno, String fname, String sname) {
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.fname = fname;
		this.sname = sname;

	}
	public void showdata()
	{
		System.out.println("Rol no :"+rollno);
		System.out.println("Name :"+fname);
		System.out.println("Last Name :"+sname);
	}
}
