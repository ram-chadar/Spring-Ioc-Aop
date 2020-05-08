package com.jbk.setter;

public class Contact {
private String mobile;
private String landline;
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getLandline() {
	return landline;
}
public void setLandline(String landline) {
	this.landline = landline;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mobile :"+mobile+" \n"+
				"Landline :"+landline;
	}
}
