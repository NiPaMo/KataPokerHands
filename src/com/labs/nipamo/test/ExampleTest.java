package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.HandComparator;
import com.labs.nipamo.pokerhands.ranks.Ranker;
import com.labs.nipamo.pokerhands.Hand;

class ExampleTest {

	@Test
	// Example line 1
	void testGetResult() {
		Hand hand1 = new Hand("2H 3D 5S 9C KD");
		Hand hand2 = new Hand("2C 3H 4S 8C AH");
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		assertEquals("White wins. - with high card: Ace",
				HandComparator.getResult(hand1, hand2));
	}
	
	@Test
	// Example line 2
	void testGetResult2() {
		Hand hand1 = new Hand("2H 4S 4C 2D 4H");
		Hand hand2 = new Hand("2S 8S AS QS 3S");
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		assertEquals("Black wins. - with full house: 4",
				HandComparator.getResult(hand1, hand2));
	}
	
	@Test
	// Example line 3
	void testGetResult3() {
		Hand hand1 = new Hand("2H 3D 5S 9C KD");
		Hand hand2 = new Hand("2C 3H 4S 8C KH");
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		assertEquals("Black wins. - with high card: 9",
				HandComparator.getResult(hand1, hand2));
	}
	
	@Test
	// Example line 4
	void testGetResult4() {
		Hand hand1 = new Hand("2H 3D 5S 9C KD");
		Hand hand2 = new Hand("2D 3H 5C 9S KH");
		
		Ranker.rank(hand1);
		Ranker.rank(hand2);
		
		assertEquals("Tie.",
				HandComparator.getResult(hand1, hand2));
	}
}
