package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.Pair;
import com.labs.nipamo.pokerhands.ranking.RanksEnum;

class PairTest {

	@Test
	void testPairExists() {
		Hand hand = new Hand("2H 2D 5S 9C KD");	
		Pair pair = new Pair();
		boolean result = pair.isRank(hand);
		pair.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(RanksEnum.PAIR, hand.getRank());
		assertEquals(FacesEnum.TWO, hand.getScore());
	}
	
	@Test
	void testPairNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		Pair pair = new Pair();
		boolean result = pair.isRank(hand);
		
		assertEquals(false, result);
	}

}
