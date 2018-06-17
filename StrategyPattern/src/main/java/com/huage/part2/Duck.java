package com.huage.part2;

import com.huage.part2.fly.Flyable;
import com.huage.part2.tweet.Tweetable;

/**
 * 鸭子超类
 */
public abstract class Duck {
	public Flyable flyable;
	public Tweetable tweetable;
	

	@Override
	public String toString() {
		return "Duck [flyable=" + flyable + ", tweetable=" + tweetable + "]";
	}
	
	/**
	 * 飞行实现,依赖接口实现,针对接口编程不针对实现编程
	 */
	public void fly() {
		flyable.fly();
	}
	
	/**
	 * 喊叫实现,依赖接口实现,针对接口编程不针对实现编程
	 */
	public void tweet() {
		tweetable.tweet();
	}
	
	public abstract void display();
}
