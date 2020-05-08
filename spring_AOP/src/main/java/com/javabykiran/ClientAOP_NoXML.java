package com.javabykiran;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientAOP_NoXML {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigClass.class);
		Invoice invoice = context.getBean(Invoice.class);
		System.out.println(invoice);
		invoice.receivePayment();
		invoice.returnCash();
	}
}
