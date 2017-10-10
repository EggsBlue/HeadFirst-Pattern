package com.part3;

public class Test {
	public static void main(String[] args) {
		Duck duck = new MallDuck();
		duck.display();
		duck.flyshow();
		duck.quackShow();

		Duck noWayDuck = new NoWayDuck();
		noWayDuck.display();
		noWayDuck.flyshow();
		noWayDuck.quackShow();

	}
}
