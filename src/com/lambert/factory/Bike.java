package com.lambert.factory;

public class Bike implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Bike starting delivery");
	}

	@Override
	public void getCargo() {
		System.out.println("Bike getting package");
	}

}
