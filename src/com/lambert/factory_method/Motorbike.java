package com.lambert.factory_method;

public class Motorbike implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Motorbike starting delivery");
	}

	@Override
	public void getCargo() {
		System.out.println("Motorbike getting some packages");
	}

}
