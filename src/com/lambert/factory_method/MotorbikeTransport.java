package com.lambert.factory_method;

public class MotorbikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Bike();
	}

}
