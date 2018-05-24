package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.FacesEnum;
import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.ranking.FourOfAKind;
import com.labs.nipamo.pokerhands.ranking.RanksEnum;

class FourOfAKindTest {

	@Test
	void testFourOfAKindExists() {
		Hand hand = new Hand("7H 7D 7S 7C KD");	
		FourOfAKind fourOfAKind = new FourOfAKind();
		boolean result = fourOfAKind.isRank(hand);
		fourOfAKind.setScore(hand);
		
		assertEquals(true, result);
		assertEquals(RanksEnum.FOUR_OF_A_KIND, hand.getRank());
		assertEquals(FacesEnum.SEVEN, hand.getScore());
	}
	
	@Test
	void testFourOfAKindNotExists() {
		Hand hand = new Hand("2H 7D 5S 9C KD");	
		FourOfAKind fourOfAKind = new FourOfAKind();
		boolean result = fourOfAKind.isRank(hand);
		
		assertEquals(false, result);
	}

}
