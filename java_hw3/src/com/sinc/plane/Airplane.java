package com.sinc.plane;

public class Airplane extends Plane {

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public int refuel(int fuel) {

		setFuelSize(getFuelSize() + fuel);

		return getFuelSize();
	}

	@Override
	public int flight(int distance) {

		setFuelSize(getFuelSize() - ((distance / 10) * 30));

		return getFuelSize();
	}

}
