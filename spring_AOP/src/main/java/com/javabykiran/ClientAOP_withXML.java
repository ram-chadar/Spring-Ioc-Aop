package com.javabykiran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientAOP_withXML {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
		Invoice invoice = (Invoice)context.getBean("invoice");
		System.out.println(invoice);
		invoice.receivePayment();
		invoice.returnCash();
	}
}
