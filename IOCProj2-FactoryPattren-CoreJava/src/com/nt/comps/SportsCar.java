package com.nt.comps;

public class SportsCar implements ICar {

	@Override
	public void assemble() {
		System.out.println("SportsCar::Ferrari assembling");

	}  

	@Override
	public void testDrive() {
		System.out.println("SportsCar::Ferrari testDrive");

	}

	@Override
	public void deliver() {
		System.out.println("SportsCar::Ferrari delivery to Customer");
	}
	
	@Override
	public void drive() {
		System.out.println("SportsCar::Customer driving Ferrari car");
		
	}

}
