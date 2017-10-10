package com.part3;
/**
 * 不会飞
 *
 * 作者:王庆华
 * 时间:2017年10月10日 上午9:50:17
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("我不会飞...");
	}

}
