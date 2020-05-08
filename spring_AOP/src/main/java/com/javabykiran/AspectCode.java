package com.javabykiran;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectCode {

	@Before("execution(* com.javabykiran.Invoice.*())")
	public void logStartingTime() {
		System.out.println("Time to start : " + new java.util.Date());
	}

	@After("execution(* com.javabykiran.Invoice.*())")
	public void logExitTime() {
		System.out.println("Time to exit : " + new java.util.Date());
	}

}
