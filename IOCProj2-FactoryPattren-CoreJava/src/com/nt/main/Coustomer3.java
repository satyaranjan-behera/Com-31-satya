package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.CarFactory;

public class Coustomer3 {

	public static void main(String[] args) {
		ICar car=CarFactory.getInsstance("sports");
		car.drive();
	}
}
 