package com.lambert.factory_method;

public class CarTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Car();
	}
	
}
