package com.lambert.factory_method;

public class BikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorbike();
	}
	
}
