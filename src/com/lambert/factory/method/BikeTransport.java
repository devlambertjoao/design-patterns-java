package com.lambert.factory.method;

public class BikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorbike();
	}
	
}
