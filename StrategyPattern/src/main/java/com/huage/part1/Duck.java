package com.huage.part1;
/**
 * 鸭子超类
 */
public abstract class Duck {
//	public void quack() {
//		System.out.println("嘎嘎叫...");
//	}

	public void swim() {
		System.out.println("游泳了...");
	}

//	public void flay() {
//		System.out.println("飞呀飞呀~");
//	}

	//由于每种鸭子的外观不同,所以设计为抽象的
	public abstract void display();
}
