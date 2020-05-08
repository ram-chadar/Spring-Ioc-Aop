package com.jbk.set;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String qname;
	private List< Answer> answer;
	
	public Question(int id,String qname,List<Answer> answer) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.qname=qname;
		this.answer=answer;
		
	}
	
	public void showdata()
	{
		System.out.println("ID :"+id);
		System.out.println("Question :"+qname);
		System.out.println("Answer :");
		
		Iterator<Answer>itr=answer.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
