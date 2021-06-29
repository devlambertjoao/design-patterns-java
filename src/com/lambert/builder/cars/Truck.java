package com.lambert.builder.cars;

import com.lambert.builder.components.CarType;
import com.lambert.builder.components.Engine;
import com.lambert.builder.components.Transmission;

public class Truck {

	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;

	public Truck(CarType carType, int seats, Engine engine, Transmission transmission) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}

	public String result() {
		String truck = "Truck with motor: " + engine.getPower() + "\n";
		truck += "Transmission: " + transmission + "\n";
		truck += "Type: " + carType + "\n";
		truck += "Seats: " + seats + "\n";
		
		return truck;
	}
	
}
