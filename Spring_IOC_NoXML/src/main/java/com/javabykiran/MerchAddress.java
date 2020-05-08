package com.javabykiran;

import org.springframework.beans.factory.annotation.Value;

public class MerchAddress {
	@Value("${data.officeNo}")
	String officeNo;

	@Override
	public String toString() {
		return "MerchAddress [officeNo=" + officeNo + "]";
	}

}
