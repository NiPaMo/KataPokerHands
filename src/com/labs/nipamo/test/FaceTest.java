package com.labs.nipamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.labs.nipamo.pokerhands.enums.Face;

class FaceTest {

	@Test
	void testGetValue() {
		
		assertEquals("5", Face.FIVE.getValue());
	}
	
	@Test
	void testGetValueConvert() {
		
		assertEquals("Queen", Face.QUEEN.getValue());
	}

	@Test
	void testGetEnum() {
		
		assertEquals(Face.ACE, Face.getEnum("A"));
	}
}
