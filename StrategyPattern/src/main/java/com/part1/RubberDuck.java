package com.part1;
/**
 * 木头鸭子
 * @author Administrator
 *
 */
public class RubberDuck extends Duck implements Quarkable{

	@Override
	public void display() {
		System.out.println("我是一只木头鸭子!");
	}

	@Override
	public void quark() {
		System.out.println("我是木头鸭子,只会吱吱叫...");
	}

}
