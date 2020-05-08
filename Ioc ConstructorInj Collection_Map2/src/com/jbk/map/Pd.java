package com.jbk.map;

public class Pd {
	private String fname;
	private String sname;

	public Pd(String fname, String sname) {
		// TODO Auto-generated constructor stub
		this.fname = fname;
		this.sname = sname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :" + fname + "\n" + "SurName :" + sname;
	}
}
