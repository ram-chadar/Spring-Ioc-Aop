package com.jbk.setter;

import java.util.Iterator;
import java.util.List;

public class Student {
private int rollno;
private String name;
private List<Contact> contact;
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
public List<Contact> getContact() {
	return contact;
}
public void setContact(List<Contact> contact) {
	this.contact = contact;
}
public void showdata()
{
	System.out.println("Roll no. :"+rollno);
	System.out.println("Name :"+name);
	System.out.println("Contact");
	
	Iterator<Contact>itr=contact.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
