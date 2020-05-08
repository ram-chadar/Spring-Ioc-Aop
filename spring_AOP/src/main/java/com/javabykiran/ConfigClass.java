package com.javabykiran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy//AOP
public class ConfigClass {

	@Bean
	Invoice invoiceBean() {
		return new Invoice();
	}

	@Bean
	AspectCode ascpectBean() {
		return new AspectCode();
	}
}
