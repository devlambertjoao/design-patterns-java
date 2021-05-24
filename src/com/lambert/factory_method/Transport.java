package com.lambert.factory_method;

public abstract class Transport {
	public void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRoute();
	}
	
	protected abstract IVehicle createTransport();
}
