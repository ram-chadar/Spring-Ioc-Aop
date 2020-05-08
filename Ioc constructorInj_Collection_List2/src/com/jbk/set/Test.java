package com.jbk.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	
	Question q=(Question) context.getBean("question");
	q.showdata();

	}

}
