package com.other.info;

public class Seller {
	private String sellerName;
	private Address address;
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayOwnerInfo() {
		System.out.print("\nName => "+sellerName);
		System.out.print("\nAddress => "+address.getAddress());
	}
}
