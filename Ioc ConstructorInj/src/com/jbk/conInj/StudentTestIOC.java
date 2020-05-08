package com.jbk.conInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTestIOC {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = (Student) context.getBean("stu");
		Address addr=(Address) context.getBean("addr");
		System.out.println(stu.getAge());
		System.out.println(stu.getLoc());
		System.out.println(stu.getAddress());
		System.out.println(stu.getMobNos());
		

	}
}
