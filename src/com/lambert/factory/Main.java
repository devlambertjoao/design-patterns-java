package com.lambert.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static Transport tempTransport;

	public static void main(String[] args) {
		List<TransportTypeEnum> transports = new ArrayList<>();
		transports.add(TransportTypeEnum.CAR);
		transports.add(TransportTypeEnum.BIKE);
		transports.add(TransportTypeEnum.MOTORBIKE);
		startUp(transports);
	}

	private static void startUp(List<TransportTypeEnum> transports) {
		transports.forEach(t -> {
			switch (t) {
			case CAR:
				tempTransport = new CarTransport();
				break;
			case BIKE:
				tempTransport = new BikeTransport();
				break;
			case MOTORBIKE:
				tempTransport = new MotorbikeTransport();
				break;
			default:
				break;
			}
			
			tempTransport.createTransport().startRoute();
		});
	}
}
