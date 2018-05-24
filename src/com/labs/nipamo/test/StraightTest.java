package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.RanksEnum;
import com.labs.nipamo.pokerhands.ranking.Straight;

class StraightTest {

	@Test
	void testStraightExists() {
		Hand hand = new Hand("4H 6D 5S 3C 7D");	
		Straight straight = new Straight();
		boolean result = straight.isRank(hand);
		straight.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(RanksEnum.STRAIGHT, hand.getRank());
		assertEquals(FacesEnum.SEVEN, hand.getScore());
	}
	
	@Test
	void testStraightNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		Straight straight = new Straight();
		boolean result = straight.isRank(hand);
		
		assertEquals(false, result);
	}

}
