package com.labs.nipamo.pokerhands;

import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Suit;

public class Card {
	private Suit suit;
	private Face face;
	
	/**
	 * Creates a Card object from a SuitsEnum and FacesEnum
	 * 
	 * @param s - Suit
	 * @param f - Face
	 */
	public Card(Face f, Suit s) {
		this.face = f;
		this.suit = s;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public Face getFace() {
		return this.face;
	}
}
