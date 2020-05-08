package com.javabykiran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Merchant {

	@Value("${data.merchId}")
	int merchantId;

	@Value("${data.legalBusinessName}")
	String legalBusinessName;

	@Autowired
	MerchAddress merchAddress;

	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", legalBusinessName=" + legalBusinessName + ", merchAddress="
				+ merchAddress + "]";
	}
}
