package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;
import com.labs.nipamo.pokerhands.ranks.Flush;

class FlushTest {

	@Test
	void testFlushExists() {
		Hand hand = new Hand("2H 6H 2H 9H QH");	
		Flush flush = new Flush();
		boolean result = flush.isRank(hand);
		flush.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(Rank.FLUSH, hand.getRank());
		assertEquals(Face.QUEEN, hand.getScore());
	}
	
	@Test
	void testFlushNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		Flush flush = new Flush();
		boolean result = flush.isRank(hand);
		
		assertEquals(false, result);
	}

}
