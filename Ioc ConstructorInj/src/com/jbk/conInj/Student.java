package com.jbk.conInj;

import java.util.ArrayList;

public class Student {
	
	
	Address address;
	
	public Student() {
		System.out.println("I am in const...");
	}

	int age;

	String loc;

	ArrayList<String> mobNos;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public ArrayList<String> getMobNos() {
		return mobNos;
	}



	public void setMobNos(ArrayList<String> mobNos) {
		this.mobNos = mobNos;
	}

	@Override
	public String toString() {
		System.out.println(address);
		return "age >> " + age + "  loc >> " + loc + " mob nos >> " + mobNos;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}







