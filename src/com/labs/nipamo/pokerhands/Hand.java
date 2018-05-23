package com.labs.nipamo.pokerhands;

import java.util.ArrayList;

import com.labs.nipamo.pokerhands.ranking.RanksEnum;

public class Hand {
	private ArrayList<Card> cards;
	private RanksEnum rank;
	private FacesEnum score;
	
	public Hand(String str) {
		ArrayList<FacesEnum> faces = new ArrayList<>();
		ArrayList<SuitsEnum> suits = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			FacesEnum face = FacesEnum.getEnum(str.substring(i, i+1));
			SuitsEnum suit = SuitsEnum.getEnum(str.substring(i+1, i+2));
			i+=2;
			faces.add(face);
			suits.add(suit);
		}
		
		Card card1 = new Card(suits.get(0),faces.get(0));
		Card card2 = new Card(suits.get(1),faces.get(1));
		Card card3 = new Card(suits.get(2),faces.get(2));
		Card card4 = new Card(suits.get(3),faces.get(3));
		Card card5 = new Card(suits.get(4),faces.get(4));
		
		addCards(card1, card2, card3, card4, card5);
	}
	
	private void addCards(Card c1, Card c2, Card c3, Card c4, Card c5) {
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
	
	public void setRank(RanksEnum r) {
		 this.rank = r;
	}
	
	public RanksEnum getRank() {
		return this.rank;	
	}	
	
	public void setScore(FacesEnum s) {
		this.score = s;
	}
	
	public FacesEnum getScore() {
		return this.score;
	}
}
