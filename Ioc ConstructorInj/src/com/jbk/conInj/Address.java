package com.jbk.conInj;

public class Address {
	String pincode;

	String city;

	/*
	 * public Address() { }
	 */
	public Address(String pincode, String city) {
		System.out.println("I am in param const....");
		this.pincode = pincode;
		this.city = city;
	}

	@Override
	public String toString() {
		System.out.println(pincode);
		System.out.println(city);
		return super.toString();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
