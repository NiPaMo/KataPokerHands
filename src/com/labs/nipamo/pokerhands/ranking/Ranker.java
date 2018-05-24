package com.labs.nipamo.pokerhands.ranking;

import com.labs.nipamo.pokerhands.Hand;

public abstract class Ranker {
	
	// Private constructor so class cannot be instantiated
	private Ranker() { }
	
	public static void rank(Hand h) {
		StraightFlush straightFlush = new StraightFlush();
		FourOfAKind fourOfAKind = new FourOfAKind();
		FullHouse fullHouse = new FullHouse();
		Flush flush = new Flush();
		Straight straight = new Straight();
		ThreeOfAKind threeOfAKind = new ThreeOfAKind();
		TwoPairs twoPairs = new TwoPairs();
		Pair pair = new Pair();
		HighCard highCard = new HighCard();
		
		if (straightFlush.isRank(h))
			straightFlush.setScore(h);
		else if (fourOfAKind.isRank(h))
			fourOfAKind.setScore(h);
		else if (fullHouse.isRank(h))
			fullHouse.setScore(h);
		else if (flush.isRank(h))
			flush.setScore(h);
		else if (straight.isRank(h))
			straight.setScore(h);
		else if (threeOfAKind.isRank(h))
			threeOfAKind.setScore(h);
		else if (twoPairs.isRank(h))
			twoPairs.setScore(h);
		else if (pair.isRank(h))
				pair.setScore(h);
		else {
			highCard.isRank(h);
			highCard.setScore(h);
		}
	}
}
