package com.nt.factory;

import com.nt.comps.ICar;
import com.nt.comps.LuxoryCar;
import com.nt.comps.OffRoadingCar;
import com.nt.comps.SportsCar;
import com.nt.comps.standardCar;

public class CarFactory {

	//static factory method having factory pattern logic
	public static ICar getInsstance(String carType) {
		ICar car=null;
		if(carType.equalsIgnoreCase("luxory")) {
			car=new LuxoryCar();
		}
		else if(carType.equalsIgnoreCase("sports")){
			 car= new SportsCar();
		}
		else if(carType.equalsIgnoreCase("off-roading")) {
			car=new OffRoadingCar();
		}
		else if(carType.equalsIgnoreCase("standard")) {
			car=new standardCar();
		}
		else
			throw new IllegalArgumentException("invalid car type");
		
		car.assemble();
		car.testDrive();
		car.deliver();
		return car;
	}
}
