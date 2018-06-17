package com.part2.duck;

import com.part2.FlayWithWings;
import com.part2.Quark;

public class MallardDuck extends Duck{

	@Override
	public void display() {
		System.out.println("我是真正的鸭子...");
	}

	public MallardDuck() {
		flayBehavior = new FlayWithWings();
		quarkBehavior = new Quark();
	}

}
