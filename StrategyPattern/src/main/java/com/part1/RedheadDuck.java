package com.part1;

/**
 * 红头鸭子...
 * @author Administrator
 *
 */
public class RedheadDuck extends Duck implements Flyable,Quarkable {

	@Override
	public void display() {
		System.out.println("我是红头...");
	}

	@Override
	public void quark() {
		System.out.println("我是红头鸭子,我会嘎嘎叫...");

	}

	@Override
	public void flay() {
		System.out.println("我是红头鸭子,我会飞...");

	}

}
