package com.laptop.app;

public class Intel implements Cpu{

	@Override
	public void name() {
		System.out.print("Intel ");
		
	}

	@Override
	public void generation() {
		System.out.print("Dual-Core ");
		
	}

}
