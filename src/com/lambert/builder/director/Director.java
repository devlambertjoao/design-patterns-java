package com.lambert.builder.director;

import com.lambert.builder.builders.IBuilder;
import com.lambert.builder.components.CarType;
import com.lambert.builder.components.Engine;
import com.lambert.builder.components.Transmission;

public class Director {

	public void constructSedanCar(IBuilder builder) {
		builder.setCarType(CarType.SEDAN);
		builder.setSeats(5);
		builder.setEngine(new Engine(2000));
		builder.setTransmission(Transmission.CVT);
	}
	
	public void constructTruck(IBuilder builder) {
		builder.setCarType(CarType.TRUCK);
		builder.setSeats(3);
		builder.setEngine(new Engine(12000));
		builder.setTransmission(Transmission.AUTOMATIC);
	}
}
