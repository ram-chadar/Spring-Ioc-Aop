package com.jbk.Object;

public class Address {

	private String citty;
	private String state;
	private String country;
	
	public Address(String city,String state,String country) {
		// TODO Auto-generated constructor stub
		this.citty=city;
		this.state=state;
		this.country=country;
	}
	
	public String  show() {
		// TODO Auto-generated method stub
		
		return "City:"+citty+" \n"+
		"State :"+state+"\n"+
		"Country :"+country;
	}
}
