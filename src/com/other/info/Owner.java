package com.other.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Owner {
	@Value("${owner.name}")
	private String ownerName;
	@Autowired
	@Qualifier("ownerAddress")
	private Address ownerAddress;
	
	public void setAddress(Address address) {
		this.ownerAddress = address;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void displayOwnerInfo() {
		System.out.print("\nName => "+ownerName);
		System.out.print("\nAddress => "+ownerAddress.getAddress());
	}
}
