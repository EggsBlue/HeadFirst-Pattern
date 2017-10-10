package com.part3;
/**
 * 普通鸭子...
 *
 * 作者:王庆华
 * 时间:2017年10月10日 上午9:54:46
 */
public class MallDuck extends Duck{

	public MallDuck() {
		super.setFlyBehavior(new FlyWithWings());
		super.setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("我是一只普通的小鸭子...");
	}

}
