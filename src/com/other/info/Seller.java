package com.other.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Seller {
	private String sellerName;
	@Autowired
	@Qualifier("sellerAddress")
	private Address sellerAddress;
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public void setAddress(Address address) {
		this.sellerAddress = address;
	}
	public void displaySellerInfo() {
		System.out.print("\nName => "+sellerName);
		System.out.print("\nAddress => "+sellerAddress.getAddress());
	}
}
