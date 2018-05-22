package com.labs.nipamo.pokerhands;

public class Card {
	private SuitsEnum suit;
	private FacesEnum face;
	
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
