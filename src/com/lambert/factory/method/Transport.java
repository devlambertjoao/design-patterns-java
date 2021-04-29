package com.lambert.factory.method;

public abstract class Transport {
	public void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRoute();
	}
	
	protected abstract IVehicle createTransport();
}
