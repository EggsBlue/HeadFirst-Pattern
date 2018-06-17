package com.part2.tweet;

public class NoTweet implements Tweetable{

	@Override
	public void tweet() {
		System.out.println("不会叫....");
	}
	
}
