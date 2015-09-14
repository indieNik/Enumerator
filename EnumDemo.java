package com.psl.coffee;

import static java.lang.Math.random;

enum Coffee{
	SMALL(50) , MEDIUM(100), LARGE(200);
	int price;
	private Coffee(int p) {

		price = p;
	}
}

public class EnumDemo {
	public static void main(String[] args) {
		
		Coffee cList[] = Coffee.values();
		
		for (Coffee c : cList) {
			System.out.println(c.price*random());
		}
	}
}
