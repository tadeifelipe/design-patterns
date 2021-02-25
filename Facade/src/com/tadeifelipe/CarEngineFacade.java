package com.tadeifelipe;

public class CarEngineFacade {
	private CatalyticConverter catalyticConverter = new CatalyticConverter() ;
	private FuelPump fuelPump = new FuelPump();
	private Radiator radiator = new Radiator();
	private Starter starter = new Starter();
	
	public void startEngine() {
		catalyticConverter.on();
		fuelPump.pumpOn();
		radiator.on();
		starter.start();
		System.out.println("Start engines ok!");
	}
	
	public void stopEngine() {
		catalyticConverter.off();
		fuelPump.pumpOff();
		radiator.off();
		System.out.println("Stop engines ok!");
	}
}
