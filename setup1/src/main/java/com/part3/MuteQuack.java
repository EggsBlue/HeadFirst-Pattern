package com.part3;
/**
 * 不会叫
 *
 * 作者:王庆华
 * 时间:2017年10月10日 上午9:50:05
 */
public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("我不会叫...");
	}

}
