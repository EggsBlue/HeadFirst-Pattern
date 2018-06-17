package com.part1;

public class Test {
	public static void main(String[] args) {
		
		MallardDuck md = new MallardDuck();
		md.display();
		md.quark();
		md.swim();
		
		md.flay();
		
		RedheadDuck rd = new RedheadDuck();
		rd.display();
//		rd.quack();
		rd.swim();
		rd.flay();
		
		
		RubberDuck rbd = new RubberDuck();
		rbd.display();
		rbd.quark();
		rbd.swim();
//		rbd.flay();
	}
}
