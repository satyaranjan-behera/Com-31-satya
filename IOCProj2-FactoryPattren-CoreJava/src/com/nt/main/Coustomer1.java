package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.CarFactory;

public class Coustomer1 {

	public static void main(String[] args) {
		ICar car=CarFactory.getInsstance("luxory");
		car.drive();
	}
}
 