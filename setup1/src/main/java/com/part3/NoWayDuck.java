package com.part3;
/**
 * 哑巴鸭子
 *
 * 作者:王庆华
 * 时间:2017年10月10日 上午9:54:53
 */
public class NoWayDuck extends Duck{

	public NoWayDuck() {
		super.setFlyBehavior(new FlyNoWay());
		super.setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("我是一只哑巴鸭子...");
	}

}
