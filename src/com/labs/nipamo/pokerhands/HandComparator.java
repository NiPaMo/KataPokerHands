package com.labs.nipamo.pokerhands;

import com.labs.nipamo.pokerhands.enums.Rank;
import com.labs.nipamo.pokerhands.ranks.HighCard;

public abstract class HandComparator {

	private static int winner;
	
	// Private constructor so class cannot be instantiated
	private HandComparator() { }
	
	private static void compareRank(Hand h1, Hand h2) {
		if (h1.getRank().compareTo(h2.getRank()) > 0) {
			winner =  1;
		} else if (h1.getRank().compareTo(h2.getRank()) < 0) {
			winner = 2;
		} else {
			winner = compareScore(h1, h2);
		}
	}
	
	private static int compareScore(Hand h1, Hand h2) {
		int flag;
		
		if (h1.getScore().compareTo(h2.getScore()) > 0)
			return 1;
		if (h1.getScore().compareTo(h2.getScore()) < 0)
			return 2;
			
		// Check next cards if there is a tie
		if (h1.getRank().equals(Rank.HIGH_CARD)) {
			HighCard highCard = new HighCard();
			
			for (int i = 0; i < 4; i++) {
				highCard.setScore(h1, i);
				highCard.setScore(h2, i);
				if (h1.getScore().compareTo(h2.getScore()) > 0)
					return 1;
				if (h1.getScore().compareTo(h2.getScore()) < 0)
					return 2;
			}
		}
		
			// Same cards - tie
			return 0;
	}
	
	public static String getResult(Hand h1, Hand h2) {
		compareRank(h1, h2);
		
		if (winner == 1)
			return("Black wins. - with " + h1.getRank().getValue() + ": " + h1.getScore().getValue());
		else if (winner == 2)
			return("White wins. - with " + h2.getRank().getValue() + ": " + h2.getScore().getValue());
		else
			return("Tie.");
	}
}
