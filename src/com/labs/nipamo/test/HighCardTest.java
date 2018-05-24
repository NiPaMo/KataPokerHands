package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;
import com.labs.nipamo.pokerhands.ranks.HighCard;

class HighCardTest {

	@Test
	void testHighCardExists() {
		Hand hand = new Hand("2H 4D 5S 9C KD");	
		HighCard highCard = new HighCard();
		boolean result = highCard.isRank(hand);
		highCard.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(Rank.HIGH_CARD, hand.getRank());
		assertEquals(Face.KING, hand.getScore());
	}
}
