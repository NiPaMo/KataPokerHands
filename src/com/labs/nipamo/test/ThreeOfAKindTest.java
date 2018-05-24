package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;
import com.labs.nipamo.pokerhands.ranks.ThreeOfAKind;

class ThreeOfAKindTest {

	@Test
	void testThreeOfAKindExists() {
		Hand hand = new Hand("AH 2D AS 9C AD");	
		ThreeOfAKind threeOfAKind = new ThreeOfAKind();
		boolean result = threeOfAKind.isRank(hand);
		threeOfAKind.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(Rank.THREE_OF_A_KIND, hand.getRank());
		assertEquals(Face.ACE, hand.getScore());
	}
	
	@Test
	void testThreeOfAKindNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		ThreeOfAKind threeOfAKind = new ThreeOfAKind();
		boolean result = threeOfAKind.isRank(hand);
		
		assertEquals(false, result);
	}

}
