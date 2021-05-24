package com.lambert.abstract_factory;

import com.lambert.abstract_factory.factories.ITransportFactory;
import com.lambert.abstract_factory.factories.LambertTransport;
import com.lambert.abstract_factory.factories.UberTransport;

public class Main {
	public static void main(String[] args) {
		App app = configureApp();
		app.startRoute();
	}

	private static App configureApp() {
		App app;
		ITransportFactory factory;
		
		String company = "lambert";
		
		if(company == "lambert") {
			factory = new LambertTransport();
		} else {
			factory = new UberTransport();
		}
		
		app = new App(factory);
		return app;
	}
}
