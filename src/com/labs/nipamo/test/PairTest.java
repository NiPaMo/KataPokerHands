package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;
import com.labs.nipamo.pokerhands.ranks.Pair;

class PairTest {

	@Test
	void testPairExists() {
		Hand hand = new Hand("2H 2D 5S 9C KD");	
		Pair pair = new Pair();
		boolean result = pair.isRank(hand);
		pair.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(Rank.PAIR, hand.getRank());
		assertEquals(Face.TWO, hand.getScore());
	}
	
	@Test
	void testPairNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		Pair pair = new Pair();
		boolean result = pair.isRank(hand);
		
		assertEquals(false, result);
	}

}
