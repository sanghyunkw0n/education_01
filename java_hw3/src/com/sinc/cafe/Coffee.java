package com.sinc.cafe;

public class Coffee {

	private String name;
	private int price;

	public Coffee() {
		super();

	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {

		return this.getName() + "\t" + this.getPrice();
		

	}

}
