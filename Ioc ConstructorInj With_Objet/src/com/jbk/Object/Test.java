package com.jbk.Object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
	Student stu=(Student) context.getBean("student");
	
	stu.showdata();
	}

}
