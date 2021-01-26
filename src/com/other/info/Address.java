package com.other.info;

public class Address {
	private String houseName;
	private String town;
	private String district;
	private String state;
	
	public Address(String houseName, String town, String district, String state) {
		this.houseName = houseName;
		this.town = town;
		this.district = district;
		this.state = state;
	}

	public String getAddress() {
		return(" "+houseName+" "+town+" "+district+" "+state);
	}
}
