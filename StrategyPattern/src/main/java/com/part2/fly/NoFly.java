package com.part2.fly;

public class NoFly implements Flyable{

	@Override
	public void fly() {
		System.out.println("不会飞~~");
	}

}
