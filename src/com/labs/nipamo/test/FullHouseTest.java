package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;
import com.labs.nipamo.pokerhands.ranks.FullHouse;

class FullHouseTest {

	@Test
	void testFullHouseExists() {
		Hand hand = new Hand("AH AD TS TC TD");	
		FullHouse fullHouse = new FullHouse();
		boolean result = fullHouse.isRank(hand);
		fullHouse.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(Rank.FULL_HOUSE, hand.getRank());
		assertEquals(Face.TEN, hand.getScore());
	}
	
	@Test
	void testFullHouseNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		FullHouse fullHouse = new FullHouse();
		boolean result = fullHouse.isRank(hand);
		fullHouse.setScore(hand);
		
		assertEquals(false, result);
	}

}
