package com.labs.nipamo.pokerhands;

import java.util.ArrayList;

public abstract class Parser {
	private static ArrayList<FacesEnum> faces;
	private static ArrayList<SuitsEnum> suits;
	
	// Private constructor so class cannot be instantiated
	private Parser() { }
	
	public static Hand parseInput(String str) {
		faces = new ArrayList<>();
		suits = new ArrayList<>();

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
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
		return hand;
	}
}
