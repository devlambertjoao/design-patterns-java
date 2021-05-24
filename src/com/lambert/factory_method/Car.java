package com.lambert.factory_method;

public class Car implements IVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Car starting delivery or trip");
	}

	@Override
	public void getCargo() {
		System.out.println("Car getting some packages or people");
	}

}
