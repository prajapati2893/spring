package com;

import org.springframework.beans.factory.annotation.Autowired;

import com.other.info.Owner;
import com.other.info.Seller;

public class receipt {
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	@Autowired
	private Owner owner;
	@Autowired
	private Seller seller;
	public void showCertificate() {
		System.out.print("\n\nCertificate:");
		System.out.print("\nThis Laptop is sold to ");
		owner.displayOwnerInfo();
		System.out.print("\nfrom the shop ");
		seller.displaySellerInfo();
	}
}
