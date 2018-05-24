package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Card;
import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Suit;

class CardTest {

	@Test
	void testGetSuit() {
		Card card = new Card(Face.NINE, Suit.HEARTS);
		
		assertEquals(Suit.HEARTS, card.getSuit());
	}

	@Test
	void testGetFace() {
		Card card = new Card(Face.NINE, Suit.HEARTS);
		
		assertEquals(Face.NINE, card.getFace());
	}

}
