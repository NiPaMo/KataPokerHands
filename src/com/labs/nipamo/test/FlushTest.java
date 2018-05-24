package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.Flush;
import com.labs.nipamo.pokerhands.ranking.RanksEnum;

class FlushTest {

	@Test
	void testFlushExists() {
		Hand hand = new Hand("2H 6H 2H 9H QH");	
		Flush flush = new Flush();
		boolean result = flush.isRank(hand);
		flush.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(RanksEnum.FLUSH, hand.getRank());
		assertEquals(FacesEnum.QUEEN, hand.getScore());
	}
	
	@Test
	void testFlushNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		Flush flush = new Flush();
		boolean result = flush.isRank(hand);
		
		assertEquals(false, result);
	}

}
