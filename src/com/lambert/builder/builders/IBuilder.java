package com.lambert.builder.builders;

import com.lambert.builder.components.CarType;
import com.lambert.builder.components.Engine;
import com.lambert.builder.components.Transmission;

public interface IBuilder {

	void setCarType(CarType type);
	void setSeats(int seats);
	void setTransmission(Transmission transmission);
	void setEngine(Engine engine);
}
