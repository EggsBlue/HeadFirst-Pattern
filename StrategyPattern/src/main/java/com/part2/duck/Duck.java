package com.part2.duck;

import com.part2.FlayBehavior;
import com.part2.QuarkBehavior;

public abstract class Duck {
	FlayBehavior flayBehavior;
	QuarkBehavior quarkBehavior;

	public void swim() {
		System.out.println("我会游泳...");
	}

	public void performFLy() {
		flayBehavior.flay();
	}

	public void performQuark() {
		quarkBehavior.quark();
	}

	public abstract void display();
}
