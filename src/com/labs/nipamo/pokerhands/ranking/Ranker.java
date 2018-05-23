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
		HighCard highCard = new HighCard();
		
		if (straightFlush.isRank(h)) {
			straightFlush.setScore(h);
			h.setRank(RanksEnum.STRAIGHT_FLUSH);
		} else if (fourOfAKind.isRank(h)){
			fourOfAKind.setScore(h);
			h.setRank(RanksEnum.FOUR_OF_A_KIND);
		} else if (fullHouse.isRank(h)){
			fullHouse.setScore(h);
			h.setRank(RanksEnum.FULL_HOUSE);
		} else if (flush.isRank(h)){
			flush.setScore(h);
			h.setRank(RanksEnum.FLUSH);
		} else if (straight.isRank(h)){
			straight.setScore(h);
			h.setRank(RanksEnum.STRAIGHT);
		} else if (threeOfAKind.isRank(h)){
			threeOfAKind.setScore(h);
			h.setRank(RanksEnum.THREE_OF_A_KIND);
		} else if (twoPairs.isRank(h)){
			twoPairs.setScore(h);
			h.setRank(RanksEnum.TWO_PAIRS);
		} else {
			highCard.setScore(h);
			h.setRank(RanksEnum.HIGH_CARD);
		}
	}
}
