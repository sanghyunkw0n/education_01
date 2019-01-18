package com.sinc.cafe;

public class Cafe {

	private Coffee[] coffAry;
	private int idx;

	public Cafe() {

		coffAry = new Coffee[3];
	}

	public void setCoffee(Coffee coff) {

		coffAry[idx++] = coff;

	}

	public Coffee[] getCoffeeList() {

		return coffAry;
	}

	public int totalPrice() {

		int totalPrice = 0;

		for (int i = 0; i < coffAry.length; i++) {
			int temp = coffAry[i].getPrice();
			totalPrice = temp + totalPrice;
		}

		return totalPrice;

	}

}
