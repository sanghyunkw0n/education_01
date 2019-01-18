package com.sinc.plane;

public class PlaneMain {

	public static void main(String[] args) {

		Plane air = new Airplane("L747", 1000);
		Plane cargo = new Cargoplane("C40", 1000);

		Plane[] plaAry = new Plane[2];

		plaAry[0] = air;
		plaAry[1] = cargo;

		System.out.println("Plane" + "\t" + "fuelsize");
		System.out.println("--------------------");
		for (int i = 0; i < plaAry.length; i++) {
			System.out.println(plaAry[i].getPlaneName() + "\t" + plaAry[i].getFuelSize());
		}
		System.out.println();
		System.out.println("100 운항");
		System.out.println("Plane" + "\t" + "fuelsize");
		System.out.println("--------------------");

		System.out.println(air.getPlaneName() + "\t" + air.flight(100));
		System.out.println(cargo.getPlaneName() + "\t" + cargo.flight(100));

		System.out.println();
		System.out.println("200 운항");
		System.out.println("Plane" + "\t" + "fuelsize");
		System.out.println("--------------------");

		System.out.println(air.getPlaneName() + "\t" + air.refuel(200));
		System.out.println(cargo.getPlaneName() + "\t" + cargo.refuel(200));

	}

}
