package com.part2.ducks;

import com.part2.Duck;
import com.part2.fly.FastFlay;
import com.part2.fly.Flyable;
import com.part2.tweet.BigTweet;
import com.part2.tweet.Tweetable;
/**
 * 红头鸭子,会快速的飞还会大叫,很强势的鸭子
 */
public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		this.flyable = new FastFlay();
		this.tweetable = new BigTweet();
	}
	
	@Override
	public void display() {
		System.out.println("我是红头鸭子...");
	}
}
