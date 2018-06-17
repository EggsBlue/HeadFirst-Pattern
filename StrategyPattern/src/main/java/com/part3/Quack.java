package com.part3;
/**
 * 会叫
 *
 * 作者:王庆华
 * 时间:2017年10月10日 上午9:50:11
 */
public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("我会叫...");
	}

}
