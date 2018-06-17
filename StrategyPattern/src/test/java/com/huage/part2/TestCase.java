package com.huage.part2;

import com.huage.part2.ducks.RedHeadDuck;
import com.huage.part2.ducks.WoodDuck;
import org.junit.Test;

public class TestCase {
	@Test
	public void test1() {
		Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.display();
		redHeadDuck.fly();
		redHeadDuck.tweet();
		
		Duck woodDuck = new WoodDuck();
		woodDuck.display();
		woodDuck.fly();
		woodDuck.tweet();
	}
}
