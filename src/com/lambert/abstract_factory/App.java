package com.lambert.abstract_factory;

import com.lambert.abstract_factory.aircrafts.IAirCraft;
import com.lambert.abstract_factory.factories.ITransportFactory;
import com.lambert.abstract_factory.landvehicles.ILandVehicle;

public class App {
	private ILandVehicle vehicle;
	private IAirCraft airCraft;

	public App(ITransportFactory factory) {
		vehicle = factory.createTransportVehicle();
		airCraft = factory.createTransportAircraft();
	}
	
	public void startRoute() {
		vehicle.startRoute();
		airCraft.startRoute();
	}
}
