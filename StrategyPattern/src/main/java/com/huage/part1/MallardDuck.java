package com.huage.part1;
/**
 * 野鸭
 * @author Administrator
 *
 */
public class MallardDuck extends Duck implements Flyable,Quarkable{

	@Override
	public void display() {
		System.out.println("我是绿头鸭子...");
	}

	@Override
	public void quark() {
		System.out.println("我是绿头鸭子,我会嘎嘎叫...");
	}

	@Override
	public void flay() {
		System.out.println("我是绿头鸭子,我会飞...");

	}

}
