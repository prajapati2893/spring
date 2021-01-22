package com.laptop.app;

public class Laptop {

	public static void main(String[] args) {
		Hardisk hdd = new Toshiba();
		Ram ram = new Patriot();
		Cpu cpu = new Intel();
		System.out.println("Laptop Specs:");
		System.out.print("Ram =>");
		ram.name();
		ram.capacity();
		ram.type();
		System.out.print("\nCPU =>");
		cpu.name();
		cpu.generation();
		System.out.print("\nHardisk =>");
		hdd.name();
		hdd.storage();
		hdd.type();

	}

}
