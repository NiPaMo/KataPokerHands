package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.enums.Suit;

class SuitTest {

	@Test
	void testGetEnum() {
		
		assertEquals(Suit.SPADES, Suit.getEnum("S"));
	}

}
