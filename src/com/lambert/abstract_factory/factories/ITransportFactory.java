package com.lambert.abstract_factory.factories;

import com.lambert.abstract_factory.aircrafts.IAirCraft;
import com.lambert.abstract_factory.landvehicles.ILandVehicle;

public interface ITransportFactory {
	ILandVehicle createTransportVehicle();
	IAirCraft createTransportAircraft();
}
