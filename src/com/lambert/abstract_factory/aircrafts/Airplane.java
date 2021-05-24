package com.lambert.abstract_factory.aircrafts;

public class Airplane implements IAirCraft {

	@Override
	public void startRoute() {
		wind();
		getCargo();
		System.out.println("Iniciando decolagem");
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros embarcando");
	}

	@Override
	public void wind() {
		System.out.println("Ventos ok");
	}

}
