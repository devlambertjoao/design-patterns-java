package com.lambert.builder.startup;

import com.lambert.builder.builders.CarBuilder;
import com.lambert.builder.cars.Car;
import com.lambert.builder.director.Director;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
		director.constructSedanCar(builder);
		
		Car car = builder.getResult();
		System.out.println("Veiculo produzido: ");
		System.out.println(car.getCarType());
		System.out.println(car.getEngine().getPower());
		System.out.println(car.getSeats());
		System.out.println(car.getTransmission());
	}
}
