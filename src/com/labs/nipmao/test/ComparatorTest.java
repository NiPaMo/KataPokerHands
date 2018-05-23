package com.labs.nipmao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Comparator;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.Ranker;

class ComparatorTest {

	@Test
	// Example line 1
	void testGetResult() {
		Hand hand1 = new Hand("2H 3D 5S 9C KD");
		Hand hand2 = new Hand("2C 3H 4S 8C AH");
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		assertEquals("White wins. - with high card: Ace",
				Comparator.getResult(hand1, hand2));
	}
	
	@Test
	// Example line 3
	void testGetResult2() {
		Hand hand1 = new Hand("2H 3D 5S 9C KD");
		Hand hand2 = new Hand("2C 3H 4S 8C KH");
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		assertEquals("Black wins. - with high card: 9",
				Comparator.getResult(hand1, hand2));
	}

}
