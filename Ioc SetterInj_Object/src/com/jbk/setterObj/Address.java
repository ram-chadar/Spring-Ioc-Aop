package com.jbk.setterObj;

public class Address {
	private String city;
	private String state;
	private String country;
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "City :"+city+"\n"+"State :"+state+"\n"+"Country :"+country;
}
}
