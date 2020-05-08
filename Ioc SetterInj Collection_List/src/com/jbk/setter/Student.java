package com.jbk.setter;

import java.util.Iterator;
import java.util.List;

public class Student {
private int rollno;
private String name;
private List mobileno;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List getMobileno() {
	return mobileno;
}
public void setMobileno(List mobileno) {
	this.mobileno = mobileno;
}

public void showdata()
{
	System.out.println("Roll No. :"+rollno);
	System.out.println("Name :"+name);
	System.out.println("Mobile Number :");
	Iterator<String>itr=mobileno.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}

}
