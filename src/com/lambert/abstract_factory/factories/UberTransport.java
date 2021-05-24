package com.lambert.abstract_factory.factories;

import com.lambert.abstract_factory.aircrafts.Airplane;
import com.lambert.abstract_factory.aircrafts.IAirCraft;
import com.lambert.abstract_factory.landvehicles.Car;
import com.lambert.abstract_factory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Car();
	}

	@Override
	public IAirCraft createTransportAircraft() {
		return new Airplane();
	}

}
