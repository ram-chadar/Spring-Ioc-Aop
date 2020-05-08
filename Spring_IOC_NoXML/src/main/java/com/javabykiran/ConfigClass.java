package com.javabykiran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "data.properties" })
public class ConfigClass {
	@Bean
	Merchant merchantBean() {
		return new Merchant();
	}

	/*
	 * @Bean({"m1", "m2"}) 
	 * Merchant merchantBeans() {
	 *      return new Merchant(); 
	 *  }
	 */

	@Bean
	MerchAddress addressBean() {
		return new MerchAddress();
	}
}
