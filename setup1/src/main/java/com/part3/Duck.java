package com.part3;
/**
 * 鸭子抽象基类
 *
 * 作者:王庆华
 * 时间:2017年10月10日 上午9:46:28
 */
public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	/**
	 * 飞,飞的功能委托给flyBehavior实现
	 */
	public void flyshow() {
		flyBehavior.fly();
	}
	/**
	 * 叫,叫的功能委托给quackBehavior实现
	 */
	public void quackShow() {
		quackBehavior.quack();
	}

	public abstract void display();

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
