package com.other.info;

public class Owner {
	private String ownerName;
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void displayOwnerInfo() {
		System.out.print("\nName => "+ownerName);
		System.out.print("\nAddress => "+address.getAddress());
	}
}
