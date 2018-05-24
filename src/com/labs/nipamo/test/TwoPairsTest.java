package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.RanksEnum;
import com.labs.nipamo.pokerhands.ranking.TwoPairs;

class TwoPairsTest {

	@Test
	void testTwoPairsExists() {
		Hand hand = new Hand("2H 2D 5S 9C 5D");	
		TwoPairs twoPairs = new TwoPairs();
		boolean result = twoPairs.isRank(hand);
		twoPairs.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(RanksEnum.TWO_PAIRS, hand.getRank());
		assertEquals(FacesEnum.FIVE, hand.getScore());
	}
	
	@Test
	void testTwoPairsNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		TwoPairs twoPairs = new TwoPairs();
		boolean result = twoPairs.isRank(hand);
		
		assertEquals(false, result);
	}

}
