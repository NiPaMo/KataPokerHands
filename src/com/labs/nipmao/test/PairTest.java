package com.labs.nipmao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.HandComparator;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.Ranker;

class PairTest {

	@Test
	void testPair() {
		Hand hand1 = new Hand("2H 2D 5S 9C KD");
		Hand hand2 = new Hand("2D 3H 5C 9S KH");
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		assertEquals("Black wins. - with pair: 2",
				HandComparator.getResult(hand1, hand2));
	}

}
