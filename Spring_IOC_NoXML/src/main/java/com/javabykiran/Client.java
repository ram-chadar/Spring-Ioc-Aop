package com.javabykiran;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

		Merchant merchant = context.getBean(Merchant.class);
		System.out.println(merchant);

	
	}
}
