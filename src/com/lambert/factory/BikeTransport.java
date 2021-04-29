package com.lambert.factory;

public class BikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorbike();
	}
	
}
