package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.Hand;

public abstract class Ranker {
	
	public static void rank(Hand h) {
		StraightFlush straightFlush = new StraightFlush();
		FourOfAKind fourOfAKind = new FourOfAKind();
		FullHouse fullHouse = new FullHouse();
		Flush flush = new Flush();
		Straight straight = new Straight();
		ThreeOfAKind threeOfAKind = new ThreeOfAKind();
		TwoPairs twoPairs = new TwoPairs();
		HighCard highCard = new HighCard();
		
		if (straightFlush.isRank(h)) {
			straightFlush.setScore(h);
			h.setRank(1);
		} else {
			highCard.setScore(h);
			h.setRank(8);
		}
	}
}
