package com.jbk.set;

public class Answer {
private String ans;
private String by;

public Answer(String ans,String by) {
	// TODO Auto-generated constructor stub
	
	this.ans=ans;
	this.by=by;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ans+" By "+by;
	}

}
