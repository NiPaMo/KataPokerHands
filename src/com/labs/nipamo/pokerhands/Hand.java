package com.labs.nipamo.pokerhands;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> cards;
	
	public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
		cards = new ArrayList<>();
		cards.add(c1);
		cards.add(c2);
		cards.add(c3);
		cards.add(c4);
		cards.add(c5);
	}
	
	public Card getCard(int i) {
		return this.cards.get(i);
	}
}
