package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.RanksEnum;
import com.labs.nipamo.pokerhands.ranking.StraightFlush;

class StraightFlushTest {

	@Test
	void testStraightFlushExists() {
		Hand hand = new Hand("4S 5S 6S 7S 9S");	
		StraightFlush straightFlush = new StraightFlush();
		boolean result = straightFlush.isRank(hand);
		straightFlush.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(RanksEnum.STRAIGHT_FLUSH, hand.getRank());
		assertEquals(FacesEnum.NINE, hand.getScore());
	}
	
	@Test
	void testStraightFlushNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		StraightFlush straightFlush = new StraightFlush();
		boolean result = straightFlush.isRank(hand);
		
		assertEquals(false, result);
	}

}
