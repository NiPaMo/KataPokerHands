package com.labs.nipamo.pokerhands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.labs.nipamo.pokerhands.enums.Face;
import com.labs.nipamo.pokerhands.enums.Rank;
import com.labs.nipamo.pokerhands.enums.Suit;

public class Hand {
	private ArrayList<Card> cards;
	private Rank rank;
	private Face score;
	
	/**
	 * Creates a Hand object of 5 cards
	 * Sorted left to right by increasing rank
	 * 
	 * @param str - A string in the form of "SF SF SF SF SF"
	 * 				where 'S' = suit and 'F' = face
	 */
	public Hand(String str) {
		ArrayList<Face> faces = new ArrayList<>();
		ArrayList<Suit> suits = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			Face face = Face.getEnum(str.substring(i, i+1));
			Suit suit = Suit.getEnum(str.substring(i+1, i+2));
			i+=2;
			faces.add(face);
			suits.add(suit);
		}
		
		Card card1 = new Card(faces.get(0), suits.get(0));
		Card card2 = new Card(faces.get(1), suits.get(1));
		Card card3 = new Card(faces.get(2), suits.get(2));
		Card card4 = new Card(faces.get(3), suits.get(3));
		Card card5 = new Card(faces.get(4), suits.get(4));
		
		addCards(card1, card2, card3, card4, card5);
	}
	
	private void addCards(Card c1, Card c2, Card c3, Card c4, Card c5) {
		cards = new ArrayList<>();
		cards.add(c1);
		cards.add(c2);
		cards.add(c3);
		cards.add(c4);
		cards.add(c5);
		
		// Sort the cards by face value
		Collections.sort(cards, new Comparator<Card>() {
		    @Override
		    public int compare(Card o1, Card o2) {
		        return o1.getFace().compareTo(o2.getFace());
		    }
		});
	}
	
	public Card getCard(int i) {
		return this.cards.get(i);
	}
	
	public void setRank(Rank r) {
		 this.rank = r;
	}
	
	public Rank getRank() {
		return this.rank;	
	}	
	
	public void setScore(Face s) {
		this.score = s;
	}
	
	public Face getScore() {
		return this.score;
	}
}
