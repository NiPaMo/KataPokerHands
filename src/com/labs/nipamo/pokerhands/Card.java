package com.labs.nipamo.pokerhands;

public class Card {
	private SuitsEnum suit;
	private FacesEnum face;
	
	/**
	 * Creates a Card object from a SuitsEnum and FacesEnum
	 * 
	 * @param s - SuitsEnum 
	 * @param f - FacesEnum
	 */
	public Card(SuitsEnum s, FacesEnum f) {
		this.suit = s;
		this.face = f;
	}
	
	public SuitsEnum getSuit() {
		return this.suit;
	}
	
	public FacesEnum getFace() {
		return this.face;
	}
}
