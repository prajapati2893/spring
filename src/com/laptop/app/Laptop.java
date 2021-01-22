package com.laptop.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml"); 
		Hardisk hdd = app.getBean("hardisk", Hardisk.class);
		Ram ram = app.getBean("ram", Ram.class);
		Cpu cpu = app.getBean("cpu", Cpu.class);
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
