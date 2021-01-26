package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.laptop.app.Cpu;
import com.laptop.app.Hardisk;
import com.laptop.app.Ram;
import com.other.info.Owner;
import com.other.info.Seller;

public class Laptop {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml"); 
		Hardisk hdd = app.getBean("hardisk", Hardisk.class);
		Ram ram = app.getBean("ram", Ram.class);
		Cpu cpu = app.getBean("cpu", Cpu.class);
		System.out.println("Laptop Specs:");
		System.out.print("Ram =>");
		ram.RamInfo();
		System.out.print("\nCPU =>");
		cpu.CpuInfo();
		System.out.print("\nHardisk =>");
		hdd.HardiskInfo();
		Owner own=app.getBean("owner", Owner.class);
		System.out.print("\n\nOwner Details:");
		own.displayOwnerInfo();
		Seller seller=app.getBean("seller", Seller.class);
		System.out.print("\n\nSeller Details:");
		seller.displaySellerInfo();
		receipt rec=app.getBean("receipt", receipt.class);
		rec.showCertificate();
	}

}
