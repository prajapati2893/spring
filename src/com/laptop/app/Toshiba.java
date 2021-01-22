package com.laptop.app;

public class Toshiba implements Hardisk{

	@Override
	public void name() {
		System.out.print("Toshiba ");
		
	}

	@Override
	public void storage() {
		System.out.print("1 TB ");
		
	}

	@Override
	public void type() {
		System.out.print("HDD ");
		
	}

}
