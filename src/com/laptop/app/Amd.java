package com.laptop.app;

public class Amd implements Cpu{

	@Override
	public void name() {
		System.out.print("AMD ");
		
	}

	@Override
	public void generation() {
		System.out.print("Ryzen 5 ");
		
	}

}
