package com.part2.ducks;

import com.part2.Duck;
import com.part2.fly.Flyable;
import com.part2.fly.NoFly;
import com.part2.tweet.NoTweet;
import com.part2.tweet.Tweetable;

/**
 * 木头鸭子,不会飞不会叫的
 */
public class WoodDuck extends Duck {
	
	public WoodDuck() {
		this.flyable = new NoFly();
		this.tweetable = new NoTweet();
	}
		
	@Override
	public void display() {
		System.out.println("我是木头鸭子..");
	}
	

}
