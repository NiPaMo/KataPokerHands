package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.enums.Rank;

class RankTest {

	@Test
	void testGetValue() {
		
		assertEquals("four of a kind", Rank.FOUR_OF_A_KIND.getValue());
	}

}
