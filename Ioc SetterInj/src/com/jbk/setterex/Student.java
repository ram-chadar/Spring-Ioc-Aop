package com.jbk.setterex;

public class Student {
private int id;
private String fname;
private String lname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

public void showdata()
{
	System.out.println("Id :"+id);
	System.out.println("Name :"+fname);
	System.out.println("Surname :"+lname);
}
}
