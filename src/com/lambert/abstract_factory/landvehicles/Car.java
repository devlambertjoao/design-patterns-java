package com.lambert.abstract_factory.landvehicles;

public class Car implements ILandVehicle {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando trajeto");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegando carga");
	}

}
