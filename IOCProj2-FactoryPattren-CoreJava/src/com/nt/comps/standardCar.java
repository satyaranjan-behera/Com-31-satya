package com.nt.comps;

public class standardCar implements ICar {

	@Override
	public void assemble() {
		System.out.println("standardCar::Maruti-suzuki swift assembling");

	}

	@Override
	public void testDrive() {
		System.out.println("standardCar::Maruti-suzuki swift testDrive");

	}

	@Override
	public void deliver() {
		System.out.println("standardCar::Maruti-suzuki swift delivery to Customer");
	}
	
	@Override
	public void drive() {
		System.out.println("standardCar::Customer driving suzuki swift car");
		
	}

}
