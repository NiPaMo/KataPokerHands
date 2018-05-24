package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.Hand;
import com.labs.nipamo.pokerhands.enums.Face;

class HandTest {

	@Test
	// Cards should always be in order from left to right
	void testHandOrder() {
		Hand hand = new Hand("QH KS 2S JH 3C");
		
		assertEquals(Face.TWO, hand.getCard(0).getFace());
		assertEquals(Face.THREE, hand.getCard(1).getFace());
		assertEquals(Face.JACK, hand.getCard(2).getFace());
		assertEquals(Face.QUEEN, hand.getCard(3).getFace());
		assertEquals(Face.KING, hand.getCard(4).getFace());		
	}
}
