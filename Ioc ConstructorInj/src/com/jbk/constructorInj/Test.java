package com.jbk.constructorInj;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       
    	  /*Resource r=new ClassPathResource("bean.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
       */   
        Student s=(Student)context.getBean("stu"); 
        Student ss =new Student();
        s.show();  
          
    }   
}  