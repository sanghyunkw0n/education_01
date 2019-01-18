package com.sinc.plane;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int refuel(int fuel) {

		setFuelSize(getFuelSize() + fuel);

		return getFuelSize();
	}

	@Override
	public int flight(int distance) {

		setFuelSize(getFuelSize() - ((distance / 10) * 50));

		return getFuelSize();
	}

}
