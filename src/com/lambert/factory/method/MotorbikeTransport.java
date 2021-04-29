package com.lambert.factory.method;

public class MotorbikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Bike();
	}

}
