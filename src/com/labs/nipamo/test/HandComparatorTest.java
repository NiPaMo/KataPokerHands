package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.HandComparator;
import com.labs.nipamo.pokerhands.HandRanker;

class HandComparatorTest {

	@Test
	void testStraight() {
		Hand hand1 = new Hand("2H 3C 4H 5S 6H");
		Hand hand2 = new Hand("9C TC JC QS KH");
		
		HandRanker.rank(hand1);
		HandRanker.rank(hand2);
		
		assertEquals("White wins. - with straight: King",
				HandComparator.getResult(hand1, hand2));
		}

}
