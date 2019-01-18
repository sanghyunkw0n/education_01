package com.sinc.cafe;

public class CafeMain {

	public static void main(String[] args) {

		Cafe cafe = new Cafe();

		Coffee cof = new Coffee("Americano", 4000);
		Coffee cof1 = new Coffee("Caffelatte", 5000);
		Coffee cof2 = new Coffee("Macchiato", 6000);

		cafe.setCoffee(cof);
		cafe.setCoffee(cof1);
		cafe.setCoffee(cof2);

		Coffee[] coffAry = cafe.getCoffeeList();

		for (int i = 0; i < coffAry.length; i++) {
			System.out.println(coffAry[i]);
		}


		System.out.println("Coffe 가격의 합 : "+ cafe.totalPrice());

	}

}
